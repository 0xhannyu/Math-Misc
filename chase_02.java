import java.util.Random;

class Main {

	String tile;

	Main(String position) { tile = position; }

	Main() { }

	int move(int tile) {

		Random random = new Random();
		int val = 0;

		switch(tile) {

		case 0 :

			val = random.nextInt(2);

			break;

		case 1 :

			val = random.nextInt(3) - 1;

			break;
		}

		return val;
	}

	String assign(int y, int x) {

		String tileVal = "";
		String[][] tiles = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

		if(x == 0) {
			if(y == 0)
				tileVal = tiles[y + move(0)][x + move(0)];
			if(y == 1)
				tileVal = tiles[y + move(1)][x + move(0)];
			if(y == 2)
				tileVal = tiles[y - move(0)][x + move(0)];
		}

		if(x == 1) {
			if(y == 0)
				tileVal = tiles[y + move(0)][x + move(1)];
			if(y == 1)
				tileVal = tiles[y + move(1)][x + move(1)];
			if(y == 2)
				tileVal = tiles[y - move(0)][x + move(1)];
		}

		if(x == 2) {
			if(y == 0)
				tileVal = tiles[y + move(0)][x - move(0)];
			if(y == 1)
				tileVal = tiles[y + move(1)][x - move(0)];
			if(y == 2)
				tileVal = tiles[y - move(0)][x - move(0)];
		}

		return tileVal;
	}

	public static void main(String[] args) {

		int steps = 1;
		int xc = 0, yc = 0, xr = 0, yr = 0;
		boolean flag = true;

		Main ob = new Main();
		Main chaser = new Main("1");
		Main runner = new Main("9");

		System.out.println("chaser   runner");

		String[][] tiles = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

		while(flag) {

			for(int i = 0 ; i < tiles.length ; i++) {
				for(int j = 0 ; j < tiles.length ; j++) {
					if(chaser.tile.equals(tiles[i][j])) { yc = i; xc = j; }
				}
			}

			for(int i = 0 ; i < tiles.length ; i++) {
				for(int j = 0 ; j < tiles.length ; j++) {
					if(runner.tile.equals(tiles[i][j])) { yr = i; xr = j; }
				}
			}


			System.out.println("  " + chaser.tile + "         " + runner.tile+"\t"+yc+""+xc+" "+yr+""+xr);

			chaser.tile = ob.assign(yc, xc);
			runner.tile = ob.assign(yr, xr);

			steps++;

			if(chaser.tile.equals(runner.tile)) {
				flag = false;
				System.out.println("\ndone in " + steps + " steps");
			}
		}
	}
}