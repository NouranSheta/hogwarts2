package library;

import hogwarts.Character;
import hogwarts.Harry;

public class Hermione extends Character implements Runnable {

	Thread t;
	int hermionepos;
	Harry h;

	public Hermione() {
		super();

	}

	public Hermione(Harry h, int myposition) {
		super();
		this.h = h;
		hermionepos = myposition;

		t = new Thread(this);
		t.setDaemon(true);
		t.start();
	}

	public Hermione(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {

		System.out.println("Sorry, I can't talk right now. I'm studying for a bloody hard subject!");

	}

	public Thread get_thread() {
		return t;
	}

	@Override
	public void run() {
		while (true) {
			if (h.getHarrypos() == hermionepos) {
				System.out.println("Harry I'm here!");
				break;
			}
		}
	}

}
