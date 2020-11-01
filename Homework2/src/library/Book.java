package library;

import hogwarts.Object;

public class Book extends Object {

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {

		System.out
		.println("This is the T. M. Riddle's diary AKA Hocrux. Don't open unless you have a Basilisk's fang!");

	}

}
