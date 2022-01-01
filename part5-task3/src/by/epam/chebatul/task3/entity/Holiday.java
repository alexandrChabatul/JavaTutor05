package by.epam.chebatul.task3.entity;

public class Holiday extends Day {

	private static final long serialVersionUID = 4878006524763826045L;
	private String reason;

	public Holiday() {
		super();
	}

	public Holiday(int date, int month, int year, String reason) {
		super(date, month, year, true);
		this.reason = reason;

	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Holiday other = (Holiday) obj;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " - (" + reason + ")";
	}

}
