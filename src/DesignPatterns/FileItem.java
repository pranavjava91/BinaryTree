package DesignPatterns;

public class FileItem implements FileSystemComponent {

	private String name;

	FileItem(String name) {
		this.name = name;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("File: " + name);

	}

}
