package by.epam.chebatul.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String name;
	private List<Directory> directories;
	private List<File> files;

	{
		name = "New directory";
		directories = new ArrayList<>();
		files = new ArrayList<>();
	}

	public Directory() {
		super();
	}

	public Directory(String name) {
		super();
		this.name = name;
	}

	public boolean addDirectory(Directory directory) {
		return directories.add(directory);
	}

	public boolean addFile(File file) {
		return files.add(file);
	}

	public boolean removeDirectory(Directory directory) {
		return directories.remove(directory);
	}

	public boolean removeFile(File file) {
		return files.remove(file);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directories == null) ? 0 : directories.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Directory other = (Directory) obj;
		if (directories == null) {
			if (other.directories != null)
				return false;
		} else if (!directories.equals(other.directories))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory " + name + ", directories - " + directories.size() + ", files - " + files.size();
	}

}
