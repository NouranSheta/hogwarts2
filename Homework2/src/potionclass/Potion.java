package potionclass;

import hogwarts.Object;

public class Potion extends Object {

	public Potion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Potion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {

		System.out.println("Gulp Gulp! The spell is starting to take over your body");

	}
}
