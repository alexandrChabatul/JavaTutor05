package by.epam.chebatul.task5.logic.impl;

import by.epam.chebatul.task5.entity.FlowerComposition;
import by.epam.chebatul.task5.entity.factory.FlowerType;
import by.epam.chebatul.task5.entity.factory.PackType;

public interface CompositionLogic {

	FlowerComposition createComposition(FlowerType flowerType, PackType packType);

	void addFlower(FlowerType flowerType, FlowerComposition composition);

	void setPack(PackType packType, FlowerComposition composition);
}
