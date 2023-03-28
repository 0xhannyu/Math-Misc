/*
   A 3x3 Grid is assumed using a 2D-Array.
   Each tile is assigned string value of 1 to 9.
   chaser and runner are two objects which are initialized
   with some pre-defined tile (not to be same),
   then they are put in a while-loop with the condition of flag-var.
   flag boolean will turn to false when the value of runner and chaser
   becomes equal. Full degree of freedom given to both objects.
   chaser makes first move then runner.
*/


import java.util.Random;

class Main {

	String tile;

	Main(String position) { tile = position; }

	public static void main(String[] args) {

		int i=1;
		boolean flag = true;

		Main chaser = new Main("1");
		Main runner = new Main("9");

		Random rand = new Random();

		String[][] tiles = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

		System.out.println("chaser   runner");

		while(flag) {

			chaser.tile = tiles[rand.nextInt(3)][rand.nextInt(3)];
			runner.tile = tiles[rand.nextInt(3)][rand.nextInt(3)];

			i++;

			System.out.println("  " + chaser.tile + "         " + runner.tile);

			if(chaser.tile.equals(runner.tile)) {
				flag = false;
				System.out.println("\ndone in " + i + " steps");
			}
		}
	}
}