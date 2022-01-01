package by.epam.chebatul.task4.dao.impl;

import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.exception.DaoException;
import java.util.List;

import by.epam.chebatul.task4.bean.Cave;

public interface CaveDaoImpl {

	boolean addTresure(Treasure treasure, Cave cave) throws DaoException;

	boolean delTreasure(Treasure treasure, Cave cave) throws DaoException;

	List<Treasure> readFile(Cave cave) throws DaoException;

}
