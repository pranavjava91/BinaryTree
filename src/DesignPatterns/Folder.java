package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

	private String name;
	private List<FileSystemComponent> items = new ArrayList<>();

	Folder(String name) {
		this.name = name;
	}

	public void add(FileSystemComponent component) {
		items.add(component);
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub

		System.out.println("Folder: " + name);
		for (FileSystemComponent item : items) {
			item.showDetails();
		}

	}

}
