package by.epam.chebatul.task5.entity.factory;

import by.epam.chebatul.task5.entity.flower.Chrysanthemum;
import by.epam.chebatul.task5.entity.flower.Flower;
import by.epam.chebatul.task5.entity.flower.Rose;
import by.epam.chebatul.task5.entity.flower.Tulip;

public class FlowerFactory {

	public Flower chooseFlower(FlowerType type) {

		Flower flower = null;

		switch (type) {
		case ROSE:
			flower = new Rose();
			break;
		case TULIP:
			flower = new Tulip();
			break;
		case CHRYSANTHEMUM:
			flower = new Chrysanthemum();
			break;
		}

		return flower;
	}

}
