package hogwarts;


public abstract class Location implements LocationMethod {

protected Character[] chars;
protected Object[] objs;

	public Location()
	{
		chars=new Character[2];
		objs=new Object[1];
	}

	public Location(Character[] chars, Object[] objs) {
		super();
		this.chars = chars;
		this.objs = objs;
	}

	public Character[] getChars() {
		return chars;
	}

	public Object[] getObjs() {
		return objs;
	}


	
public void charIsAvailable(String s) {
}

public void objIsAvailable(String s) {
}


}
