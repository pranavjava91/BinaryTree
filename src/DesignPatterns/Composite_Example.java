package DesignPatterns;

public class Composite_Example {
	
	public static void main(String[] args) {
		FileSystemComponent file1 = new FileItem("Resume.pdf");
		FileSystemComponent file2 = new FileItem("Photo.png");
		Folder docs = new Folder("Documents");
		docs.add(file1);
		docs.add(file2);
		Folder root = new Folder("Root");
		root.add(docs);
		root.showDetails();
	}

}
