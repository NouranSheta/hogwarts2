package hogwarts;

public class Watch extends Object implements Runnable {

	Thread t;
	Map marauder;
	int time;
	private static volatile boolean timeover;
	private static volatile boolean found;

	public synchronized boolean isFound() {
		return found;
	}

	public synchronized void setFound(boolean found) {
		Watch.found = found;
	}

	public Watch(Map marauder) {
		super();
		time = 0;
		this.marauder = marauder;
		timeover = false;
		found = false;
		t = new Thread(this);
		t.setDaemon(true);
		t.start();

	}

	public Thread get_thread() {
		return t;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	public synchronized boolean isTimeover() {
		return timeover;
	}

	public synchronized void setTimeover(boolean timeover) {
		Watch.timeover = timeover;
	}

	@Override
	public void run() {
		try {
			System.out.println("Find hermione and hide the map in 3 minutes");

			while (time < 180 && !isFound()) {
				Thread.sleep(1000);
				time++;
				if (time % 60 == 0)
					System.out.println(time / 60 + " minutes passed");

			}

			System.out.println("Hide map contents before someone sees you!");
			time = 0;

			while (time < 10 && !marauder.isHidden()) {
				Thread.sleep(1000);
				time++;
			}
			if (time == 10) {
				System.out.println("You have been caught... and the Marauder’s map has been confiscated.");
				this.setTimeover(true);
				t.interrupt();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
