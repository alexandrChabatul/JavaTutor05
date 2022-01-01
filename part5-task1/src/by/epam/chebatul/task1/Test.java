package by.epam.chebatul.task1;

public class Test {

	public static void main(String[] args) {
		File f = new TextFile("File", "This file!");
		File f1 = new File("File-1");
		File f2 = new TextFile("File-3", "This file 3!");

		Directory dir = new Directory("New folder.");
		dir.addFile(f);
		dir.addFile(f1);
		dir.addFile(f2);

		View view = new View();
		view.printDirectory(dir);

	}

}
