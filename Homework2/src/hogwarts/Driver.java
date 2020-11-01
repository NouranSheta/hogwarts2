package hogwarts;

import library.*;
import potionclass.*;
import dininghall.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {

		int position = 0;
		boolean word;
		Scanner input = new Scanner(System.in);
		String cmd;

		Location[] room = new Location[4];
		room[0] = new Entrance();
		room[1] = new DiningHall();
		room[2] = new Library();
		room[3] = new PotionClass();

		do {
			System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\r\n"
					+ "magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\r\n\t"
					+ "Say the magic phrase to reveal the map.");

			cmd = input.nextLine();

		} while (!cmd.toLowerCase().equals("i solemnly swear that i am up for no good")); // i solemnly swear that i am up for no good

		Map marauder = new Map();
		Watch w = new Watch(marauder);
		Harry harry = new Harry(w, position, 2);
		@SuppressWarnings("unused")
		Hermione hermione = new Hermione(harry, 2);

		room[0].look();

		while (!w.isTimeover() && !marauder.isHidden()) {
			word = false;
			cmd = input.nextLine().toLowerCase();
			if (cmd.contains("look")) {
				room[harry.getHarrypos()].look();
				word = true;

			}

			if (cmd.contains("talk")) {
				room[harry.getHarrypos()].charIsAvailable(cmd);
				word = true;
			}

			if (cmd.contains("use")) {
				room[harry.getHarrypos()].objIsAvailable(cmd);
				word = true;
			}

			if (cmd.contains("walk")) {
				harry.setHarrypos(room[harry.getHarrypos()].walk(cmd));
				word = true;
			}

			if (cmd.equals("mischief managed")) {

				marauder.setHidden(true);
				System.out.println("Hiding map contents...end.");
				word = true;

			}

			if (cmd.equals("end")) {
				word = true;
				break;
			}
			if (!word) {
				System.out.println("invalid command. Please use the actions (look,use,talk,walk)");
			}

		}
		System.out.println("THE END..");

		input.close();

	}

}
