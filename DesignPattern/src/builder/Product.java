package builder;

import java.util.ArrayList;

public class Product {

	ArrayList<String> parts = new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("Begin producing");
		for (String item: parts) {
			System.out.println("	Part " + item);
		}
	}
}
