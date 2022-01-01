package by.epam.chebatul.task3.main;

import by.epam.chebatul.task3.entity.Calendar;
import by.epam.chebatul.task3.entity.Day;
import by.epam.chebatul.task3.entity.Holiday;

public class Main {

	public static void main(String[] args) {
		
		Calendar c = new Calendar();
		c.addDay(new Day(10, 11, 2021, false));
		c.addDay(new Day(11, 11, 2021, false));
		c.addDay(new Day(12, 11, 2021, true));
		c.addDay(new Holiday(31, 12, 2021, "New Year"));
		
		System.out.println(c.getWeekendStorage().toString());
		System.out.println();
		System.out.println(c.toString());
		
	}

}
