package by.epam.chebatul.task4.view;

import java.util.List;

import by.epam.chebatul.task4.bean.Cave;
import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.exception.ServiceException;
import by.epam.chebatul.task4.logic.CaveLogic;

public class View {

	private final CaveLogic logic = CaveLogic.getInstance();
	private static final View INSTANCE = new View();

	public void printTresure(Treasure treasure) {
		System.out.println(treasure.toString());
	}

	public void printCaveTreasures(Cave cave) throws ServiceException {
		if (cave.getTreasures() == null) {
			logic.fillCaveFromSource(cave);
		}
		for (Treasure t : cave.getTreasures()) {
			System.out.println(t.toString());
		}
	}

	public void printTreasuresList(List<Treasure> treasures) {
		for (Treasure t : treasures) {
			System.out.println(t.toString());
		}
	}

	public static View getInstance() {
		return INSTANCE;
	}

}
