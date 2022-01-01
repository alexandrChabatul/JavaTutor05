package by.epam.chebatul.task5.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.chebatul.task5.entity.FlowerComposition;
import by.epam.chebatul.task5.entity.factory.FlowerFactory;
import by.epam.chebatul.task5.entity.factory.FlowerType;
import by.epam.chebatul.task5.entity.factory.PackFactory;
import by.epam.chebatul.task5.entity.factory.PackType;
import by.epam.chebatul.task5.entity.flower.Flower;
import by.epam.chebatul.task5.entity.pack.Pack;
import by.epam.chebatul.task5.logic.impl.CompositionLogic;

public class FlowerCompositionLogic implements CompositionLogic {

	private final FlowerFactory flowerFactory = new FlowerFactory();
	private final PackFactory packFactory = new PackFactory();
	
	private static final FlowerCompositionLogic INSTANCE = new FlowerCompositionLogic();
	
	private FlowerCompositionLogic() {
	}

	public FlowerComposition createComposition(FlowerType flowerType, PackType packType) {
		Flower flower = flowerFactory.chooseFlower(flowerType);
		Pack pack = packFactory.choosePack(packType);
		return new FlowerComposition(new ArrayList<>(List.of(flower)), pack);
	}
	
	public void addFlower(FlowerType flowerType, FlowerComposition composition) {
		Flower flower = flowerFactory.chooseFlower(flowerType);
		composition.addFlower(flower);
	}
	
	public void  setPack(PackType packType, FlowerComposition composition) {
		Pack pack = packFactory.choosePack(packType);
		composition.setPack(pack);
	}

	public static FlowerCompositionLogic getInstance() {
		return INSTANCE;
	}

}
