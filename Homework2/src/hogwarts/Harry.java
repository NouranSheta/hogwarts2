package hogwarts;

public class Harry extends Character implements Runnable {

	private
	//	Map marauder;
	Watch w;
	Thread t;
	int hermionepos;
	int harrypos;

	public synchronized int getHarrypos() {
		return harrypos;
	}

	public synchronized void setHarrypos(int harrypos) {
		this.harrypos = harrypos;
	}

	public Harry() {
		super();
	}

	public Harry(Watch w, int position, int hermionepos) {
		super();
		this.w = w;
		//		this.marauder = marauder;
		this.hermionepos = hermionepos;
		harrypos = position;
		t = new Thread(this);
		t.setDaemon(true);

		t.start();

	}

	public Thread get_thread() {
		return t;
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		while (!w.isTimeover()) {
			if (this.getHarrypos() == hermionepos) {
				System.out.println("found Hermione!");
				w.setFound(true);
				break;
			}
		}
	}

}
