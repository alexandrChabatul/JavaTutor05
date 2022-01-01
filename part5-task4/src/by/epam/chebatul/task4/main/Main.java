package by.epam.chebatul.task4.main;

import java.nio.file.Path;

import by.epam.chebatul.task4.bean.Cave;
import by.epam.chebatul.task4.bean.Treasure;
import by.epam.chebatul.task4.exception.ServiceException;
import by.epam.chebatul.task4.logic.CaveLogic;
import by.epam.chebatul.task4.view.View;

public class Main {

	public static void main(String[] args) {

		View view = View.getInstance();
		CaveLogic logic = CaveLogic.getInstance();

		Cave cave = new Cave(Path.of("src", "by", "epam", "chebatul", "task4", "resources", "Treasures.txt").toFile());

		try {
			System.out.println();
			view.printCaveTreasures(cave);
			System.out.println();

			System.out.println("Tresure for 100 gold:");
			view.printTreasuresList(logic.choiceForAmount(cave, 100));
			System.out.println();
			System.out.println("Print the most cost treasure:");
			Treasure t = logic.findMostExpensiveTreasure(cave);
			view.printTresure(t);
			System.out.println(logic.takeTreasureAway(t, cave));

		} catch (ServiceException e) {
			e.printStackTrace();
		}
		System.out.println("FINISH TEST");

	}

}
