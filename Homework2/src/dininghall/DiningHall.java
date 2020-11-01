package dininghall;
import hogwarts.*;
import hogwarts.Character;
import hogwarts.Object;

public class DiningHall extends Location {


	public DiningHall(Character[] chars, Object[] objs) {
		super(chars, objs);
		// TODO Auto-generated constructor stub
	}


	public DiningHall()
	{
		super();
		chars=new Character[1];
		objs=new Object[2];
		
		chars[0]=new Dumbldore();
		objs[0]=new Food();
		objs[1]=new SortingHat();
	}



	@Override
	public void charIsAvailable(String s) {
		boolean b=false;
		if(s.toLowerCase().contains("dumbldore"))
		{
			chars[0].talk();
			b=true;
		}
		else if(!b)
		{
		System.out.println("This character is not in the room. try again");
	    }
}


	@Override
	public void objIsAvailable(String s) {
		boolean b=false;
		
		if(s.toLowerCase().contains("food"))
		{
			objs[0].use();
			b=true;
		}
		
		if(s.toLowerCase().contains("hat"))
		{
			objs[1].use();
			b=true;
		}
	
	if(!b)
	{
		System.out.println("This object is not in the room. try again");

	}
}


	@Override
	public void look()
	{
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Professor \r\n" + 
				"Dumbledore is in the hall to welcome new students.\r\n"
				+"There is food on the table and a sorting hat beside Dumbldore.");		
	}

	

	@Override
	public int walk(String s)
	{
		if(s.toLowerCase().contains("south"))
		{
			System.out.println("you are back at the entrance");		
			return 0;
		}
		if(s.toLowerCase().contains("west") ||s.toLowerCase().contains("north")||s.toLowerCase().contains("east"))
		{
			System.out.println("there is nothing on that side");		
		}
		else
		{
			System.out.println("please enter a valid direction (north,east,south,west)");		
		}
		return 1;
	}





}
