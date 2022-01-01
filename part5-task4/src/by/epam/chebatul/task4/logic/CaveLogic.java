package by.epam.chebatul.task4.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import by.epam.chebatul.task4.bean.Cave;
import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.dao.CaveDao;
import by.epam.chebatul.task4.exception.DaoException;
import by.epam.chebatul.task4.exception.ServiceException;
import by.epam.chebatul.task4.logic.impl.Logic;

public class CaveLogic implements Logic {

	private static CaveDao cave_Dao = CaveDao.getInstance();
	private static final Random RAND = new Random();
	private static final CaveLogic INSTANCE = new CaveLogic();

	private CaveLogic() {
	}

	@Override
	public Treasure findMostExpensiveTreasure(Cave cave) throws ServiceException {
		if (cave.getTreasures() == null) {
			fillCaveFromSource(cave);
		}

		Treasure result = null;
		List<Treasure> temp = new ArrayList<>(cave.getTreasures());
		Collections.sort(temp);
		if (temp.size() > 1) {
			result = temp.get(temp.size() - 1);
		}
		return result;
	}

	@Override
	public List<Treasure> choiceForAmount(Cave cave, int amount) throws ServiceException {

		// Random choice.

		if (cave.getTreasures() == null) {
			fillCaveFromSource(cave);
		}

		List<Treasure> result = new ArrayList<>();

		while (amount > 0) {
			if (cave.getTreasures().size() > 1) {
				Treasure temp = null;
				int count = 0;

				while (count < 5) {
					temp = cave.getTreasures().get(RAND.nextInt(cave.getTreasures().size() - 1));
					if (temp.getPrice() <= amount) {
						amount -= temp.getPrice();
						result.add(temp);
					} else {
						count++;
					}
				}
				if (count > 0) {
					break;
				}
			} else {
				break;
			}
		}

		return result;
	}

	@Override
	public boolean takeTreasureAway(Treasure treasure, Cave cave) throws ServiceException {
		Treasure temp = null;
		for (Treasure t : cave.getTreasures()) {
			if (t.equals(treasure)) {
				temp = t;
			}
		}

		if (temp != null) {
			cave.getTreasures().remove(temp);
		}

		boolean result;
		try {
			result = cave_Dao.delTreasure(treasure, cave);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	public boolean putTreasure(Treasure treasure, Cave cave) throws ServiceException {
		if (cave.getTreasures() == null) {
			cave.setTreasures(new ArrayList<>());
		}

		cave.getTreasures().add(treasure);

		boolean result;
		try {
			result = cave_Dao.addTresure(treasure, cave);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	public void fillCaveFromSource(Cave cave) throws ServiceException {
		try {
			cave.setTreasures(cave_Dao.readFile(cave));
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	public static CaveLogic getInstance() {
		return INSTANCE;
	}

}
