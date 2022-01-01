package by.epam.chebatul.task5.entity.factory;

import by.epam.chebatul.task5.entity.pack.Basket;
import by.epam.chebatul.task5.entity.pack.Membrane;
import by.epam.chebatul.task5.entity.pack.Pack;
import by.epam.chebatul.task5.entity.pack.Paper;

public class PackFactory {

	public Pack choosePack(PackType type) {

		Pack pack = null;

		switch (type) {
		case PAPER:
			pack = new Paper();
			break;
		case MEMBRANE:
			pack = new Membrane();
			break;
		case BASKET:
			pack = new Basket();
			break;
		}

		return pack;
	}

}
