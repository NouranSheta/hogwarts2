package potionclass;

import hogwarts.Character;

public class Snape extends Character {

	public Snape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snape(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {

		System.out.println(
				"The Dark Arts . . . are many, varied, ever-changing, and eternal.\nFighting them is like fighting a many-headed monster\nwhich, each time a neck is severed, sprouts a head even fiercer and cleverer than before.\nYou are fighting that which is unfixed, mutating, indestructible.");

	}
}
