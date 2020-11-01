package dininghall;
import hogwarts.Character;


public class Dumbldore extends Character {

	public Dumbldore(String string) {
name=string;
}

	public Dumbldore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk()
	{

			System.out.println("Hello! You will find that help will always be given at Hogwarts to those who ask for it");

}
}
