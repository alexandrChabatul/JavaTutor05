package by.epam.chebatul.task5.main;

import by.epam.chebatul.task5.entity.FlowerComposition;
import by.epam.chebatul.task5.entity.factory.FlowerType;
import by.epam.chebatul.task5.entity.factory.PackType;
import by.epam.chebatul.task5.logic.FlowerCompositionLogic;
import by.epam.chebatul.task5.view.View;

public class Main {

	public static void main(String[] args) {

		FlowerCompositionLogic logic = FlowerCompositionLogic.getInstance();
		View view = new View();

		FlowerComposition fc = logic.createComposition(FlowerType.ROSE, PackType.MEMBRANE);
		
		logic.addFlower(FlowerType.TULIP, fc);

		view.printFlowerComposition(fc);

	}

}
