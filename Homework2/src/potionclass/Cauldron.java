package potionclass;

import hogwarts.Object;

public class Cauldron extends Object {

	public Cauldron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cauldron(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {

		System.out.println("Stir! The Cauldron is ready for the magic ingredients");

	}

}
