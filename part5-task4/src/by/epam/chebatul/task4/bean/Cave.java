package by.epam.chebatul.task4.bean;

import java.io.File;
import java.util.List;

public class Cave {
	
	private List<Treasure> treasures;
	private File source;
	// Path.of("src", "by", "epam", "chebatul", "task4", "resources", "Treasures.txt").toFile()
	
	public Cave() {
	}

	public Cave(File source) {
		super();
		this.source = source;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public File getSource() {
		return source;
	}

	public void setSource(File source) {
		this.source = source;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
		Cave other = (Cave) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cave [treasures=" + treasures + ", source=" + source + "]";
	}
	
}
