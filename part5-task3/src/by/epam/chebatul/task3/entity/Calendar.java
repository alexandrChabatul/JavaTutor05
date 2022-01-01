package by.epam.chebatul.task3.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Calendar implements Serializable {

	private static final long serialVersionUID = 3141056671512591844L;
	private List<Day> calendar;
	private WeekendStorage weekendStorage;

	{
		calendar = new ArrayList<>();
		weekendStorage = new WeekendStorage();
	}

	public Calendar() {
	}

	public void addDay(Day dayToAdd) {
		calendar.add(dayToAdd);
		if (dayToAdd instanceof Holiday) {
			Holiday holiday = (Holiday) dayToAdd;
			weekendStorage.addHoliday(holiday);
		} else {
			if (dayToAdd.isDayOff()) {
				weekendStorage.addWeekend(dayToAdd);
			}
		}
	}

	public List<Day> getCalendar() {
		return calendar;
	}

	public void setCalendar(List<Day> calendar) {
		this.calendar = calendar;
	}

	public WeekendStorage getWeekendStorage() {
		return weekendStorage;
	}

	public void setWeekendStorage(WeekendStorage weekendStorage) {
		this.weekendStorage = weekendStorage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		result = prime * result + ((weekendStorage == null) ? 0 : weekendStorage.hashCode());
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
		Calendar other = (Calendar) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		if (weekendStorage == null) {
			if (other.weekendStorage != null)
				return false;
		} else if (!weekendStorage.equals(other.weekendStorage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [calendar=" + calendar + "]";
	}

	public class WeekendStorage {

		private List<Holiday> holidays;
		private List<Day> weekends;

		{
			holidays = new ArrayList<>();
			weekends = new ArrayList<>();
		}

		private WeekendStorage() {
		}

		private void addHoliday(Holiday holiday) {
			holidays.add(holiday);
		}

		private void addWeekend(Day weekend) {
			weekends.add(weekend);
		}

		public List<Holiday> getHolidays() {
			return holidays;
		}

		public List<Day> getWeekends() {
			return weekends;
		}

		public void setWeekends(List<Day> weekends) {
			this.weekends = weekends;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((holidays == null) ? 0 : holidays.hashCode());
			result = prime * result + ((weekends == null) ? 0 : weekends.hashCode());
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
			WeekendStorage other = (WeekendStorage) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (holidays == null) {
				if (other.holidays != null)
					return false;
			} else if (!holidays.equals(other.holidays))
				return false;
			if (weekends == null) {
				if (other.weekends != null)
					return false;
			} else if (!weekends.equals(other.weekends))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "WeekendStorage [holidays=" + holidays + ", weekends=" + weekends + "]";
		}

	}

}
