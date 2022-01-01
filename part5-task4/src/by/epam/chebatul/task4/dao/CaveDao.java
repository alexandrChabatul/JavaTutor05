package by.epam.chebatul.task4.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.epam.chebatul.task4.bean.Cave;
import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.dao.impl.CaveDaoImpl;
import by.epam.chebatul.task4.exception.DaoException;

public class CaveDao implements CaveDaoImpl {

	private static final String DELIMETR = " - ";
	private static final CaveDao INSTANCE = new CaveDao();

	private CaveDao() {
	}

	@Override
	public boolean addTresure(Treasure treasure, Cave cave) throws DaoException {
		boolean result = false;
		String temp = treasure.getName() + DELIMETR + treasure.getPrice();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(cave.getSource(), true))) {
			writer.append(temp);
			writer.newLine();
		} catch (IOException e) {
			throw new DaoException(e);
		}
		return result;
	}

	@Override
	public boolean delTreasure(Treasure treasure, Cave cave) throws DaoException {
		boolean result = false;
		String temp = treasure.getName() + DELIMETR + treasure.getPrice();
		List<String> tresures;

		try (BufferedReader reader = new BufferedReader(new FileReader(cave.getSource()));
				BufferedWriter writer = new BufferedWriter(new FileWriter(cave.getSource(), true))) {
			tresures = reader.lines().collect(Collectors.toList());

			cave.getSource().delete();
			cave.getSource().createNewFile();

			for (String s : tresures) {
				if (!s.equals(temp) || result) {
					writer.append(s);
					writer.newLine();
				} else {
					result = true;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}

		return result;
	}

	@Override
	public List<Treasure> readFile(Cave cave) throws DaoException {
		List<Treasure> result = new ArrayList<>();
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(cave.getSource()))) {
			while ((line = reader.readLine()) != null) {
				String[] parametrs = line.split(DELIMETR);

				result.add(new Treasure(parametrs[0], Integer.parseInt(parametrs[1])));
			}
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}
		return result;
	}

	public static CaveDao getInstance() {
		return INSTANCE;
	}

}
