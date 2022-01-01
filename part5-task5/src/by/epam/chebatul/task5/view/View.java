package by.epam.chebatul.task5.view;

import by.epam.chebatul.task5.entity.FlowerComposition;
import by.epam.chebatul.task5.entity.flower.Flower;

public class View {

	public void printFlowerComposition(FlowerComposition composition) {
		System.out.println("Состав композиции:");
		System.out.print("Цветы: ");
		for (Flower f : composition.getFlowers()) {
			System.out.print(f.getType() + " ");
		}
		System.out.println();
		System.out.println("Упаковка: " + composition.getPack().getType());

	}

}
