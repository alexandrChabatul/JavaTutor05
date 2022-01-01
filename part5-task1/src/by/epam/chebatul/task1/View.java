package by.epam.chebatul.task1;

public class View {
	
	public void printDirectory(Directory directory) {
		System.out.println("Directory name - " + directory.getName());
		System.out.println("Directories:");
		if (directory.getDirectories().size() > 0 ) {
			for (Directory d : directory.getDirectories()) {
				System.out.println(d.getName());
			}
		} else {
			System.out.println("No dorectories.");
		}
		
		System.out.println();
		System.out.println("Files:");
		if (directory.getFiles().size() > 0) {
			for (File f : directory.getFiles()) {
				System.out.println(f.toString());
			}
		} else {
			System.out.println("No files.");
		}
	}

}
