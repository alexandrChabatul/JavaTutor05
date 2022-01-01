package by.epam.chebatul.task4.logic.impl;

import java.util.List;
import by.epam.chebatul.task4.bean.Cave;
import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.exception.ServiceException;

public interface Logic {
	
	Treasure findMostExpensiveTreasure(Cave cave) throws ServiceException;

	List<Treasure> choiceForAmount(Cave cave, int amount) throws ServiceException;

	boolean takeTreasureAway(Treasure treasure, Cave cave) throws ServiceException;

	boolean putTreasure(Treasure treasure, Cave cave) throws ServiceException;
}
