package dininghall;
import java.util.Random;
import hogwarts.Object;


public class SortingHat extends Object{

	public SortingHat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SortingHat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		
			Random rand=new Random();
			int randomNumber=rand.nextInt(4)+1;

			switch(randomNumber) {

			case 1:
				System.out.println("Gyffindor!");
				break;
			case 2:
				System.out.println("Hufflepuff!");
				break;
			case 3:
				System.out.println("Ravenclaw!");
				break;
			case 4:
				System.out.println("Slytherin!");
				break;
			}
		}		
	}


