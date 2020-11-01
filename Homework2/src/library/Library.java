package library;

import hogwarts.*;
import hogwarts.Character;
import hogwarts.Object;

public class Library extends Location {

	public Library() {
		super();
		chars=new Character[1];
		objs=new Object[2];
		chars[0] = new Hermione();
		objs[0] = new Book();
		objs[1] = new Quill();

	}

	public void look() {
		System.out.println("The Library is were Hogwarts' students spend most of their time\r\n"
				+ "Hermoine is sitting quietly in a corner reading a book.\r\n"
				+ "you can see a book and a quill next to her.");
	}

	@Override
	public void charIsAvailable(String s) {
		boolean b = false;
		if (s.toLowerCase().contains("hermione")) {
			chars[0].talk();
			b = true;
		} else if (!b) {
			System.out.println("This character is not in the room. try again");
		}
	}

	@Override
	public void objIsAvailable(String s) {
		boolean b = false;

		if (s.toLowerCase().contains("book")) {
			objs[0].use();
			b = true;
		}

		if (s.toLowerCase().contains("quill")) {
			objs[1].use();
			b = true;
		}

		if (!b) {
			System.out.println("This object is not in the room. try again");

		}
	}

	@Override
	public int walk(String s) {
		if (s.toLowerCase().contains("east")) {
			System.out.println("you are back at the entrance");
			return 0;
		}
		if (s.toLowerCase().contains("west") || s.toLowerCase().contains("north")
				|| s.toLowerCase().contains("south")) {
			System.out.println("there is nothing on that side");
		} else {
			System.out.println("please enter a valid direction (north,east,south,west)");
		}

		return 2;
	}

}
