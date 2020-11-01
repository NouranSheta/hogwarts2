package hogwarts;

public class Map extends Object {

	private boolean isHidden;

	public Map() {
		super();
		isHidden = false;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	public synchronized boolean isHidden() {
		return isHidden;
	}

	public synchronized void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

}
