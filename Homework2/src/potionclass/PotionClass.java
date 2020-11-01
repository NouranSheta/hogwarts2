package potionclass;

import hogwarts.*;
import hogwarts.Character;
import hogwarts.Object;

public class PotionClass extends Location {

	public PotionClass() {
		super();
		chars=new Character[1];
		objs=new Object[2];
		chars[0] = new Snape();
		objs[0] = new Cauldron();
		objs[1] = new Potion();
	}

	public void look() {
		System.out
		.println("The potion class teaches one of the cores subjects that first year wizard students study.\r\n"
				+ "Professor Snape is standing in the middle of the room and giving a lecture.\r\n"
				+ "On your desk you find a Cauldron and a potion used to apply the lesson.");
	}

	@Override
	public void charIsAvailable(String s) {
		boolean b = false;
		if (s.toLowerCase().contains("snape")) {
			chars[0].talk();
			b = true;
		} else if (!b) {
			System.out.println("This character is not in the room. try again");
		}
	}

	@Override
	public void objIsAvailable(String s) {
		boolean b = false;

		if (s.toLowerCase().contains("cauldron")) {
			objs[0].use();
			b = true;
		}

		if (s.toLowerCase().contains("potion")) {
			objs[1].use();
			b = true;
		}

		if (!b) {
			System.out.println("This object is not in the room. try again");

		}
	}

	@Override
	public int walk(String s) {

		if (s.toLowerCase().contains("west")) {
			System.out.println("you are back at the entrance");
			return 0;
		}
		if (s.toLowerCase().contains("east") || s.toLowerCase().contains("north")
				|| s.toLowerCase().contains("south")) {
			System.out.println("there is nothing on that side");
		} else {
			System.out.println("please enter a valid direction (north,east,south,west)");
		}
		return 3;
	}
}
