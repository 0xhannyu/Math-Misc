import java.util.Arrays;

class Spiral {

	public static void main(String[] args) {

		char[][] plot = new char[100][100];
		for(int i = 0; i < plot.length; i++)
			for(int j = 0 ; j < plot.length ; j++)
				plot[i][j] = ' ';

		double r; // radius
		int a = 1; // distance of spiral from centre
		double b = 1; // rate of expansion of the spiral, affects the gap between each layer (range 0.1 - 1)
		int xO = 50, yO = 50; // centre coords of the circle

		for(int i = 0 ; i <= 500 ; i++) {   // for-loop condition determines the number of layers in the spiral

			double theta = (2 * Math.PI * i) / 100; // smaller the value at place of 100, more is the spacing degree (360/n deg)

			r = a + (b * theta);

			int x = (int) Math.round(xO + r * Math.cos(theta));
			int y = (int) Math.round(yO + r * Math.sin(theta));

			if(plot[y][x] == ' ') { plot[y][x] = '@'; }

			//System.out.println(x + "\t" + y + "\t" + r + "\t" + theta + "\t" + (b*theta));
		}

		for(char[] q : plot) {

			for(char e : q) {

				System.out.print(e);

			} System.out.println();
		}
	}
}