package by.epam.chebatul.task3.entity;

import java.io.Serializable;

public class Day implements Serializable {

	private static final long serialVersionUID = -2496162519103924105L;
	private int date;
	private int month;
	private int year;
	private boolean dayOff;

	public Day() {
	}

	public Day(int date, int month, int year, boolean dayOff) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		this.dayOff = dayOff;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isDayOff() {
		return dayOff;
	}

	public void setDayOff(boolean dayOff) {
		this.dayOff = dayOff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + (dayOff ? 1231 : 1237);
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day other = (Day) obj;
		if (date != other.date)
			return false;
		if (dayOff != other.dayOff)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String dayType;
		if (dayOff) {
			dayType = "weekend";
		} else {
			dayType = "work day";
		}
		return date + "." + month + "." + year + " - " + dayType + ".";
	}

}
