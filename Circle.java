import java.util.Arrays;

class Circle {

	public static void main(String[] args) {

		char[][] plot = new char[100][100];
		for(int i = 0; i < plot.length; i++)
			for(int j = 0 ; j < plot.length ; j++)
				plot[i][j] = ' ';

		int r = 40; //Radius
		int xO = 50, yO = 50; // Centre coords of the circle

		for(int i = 0 ; i <= 100 ; i++) { 

			double theta = (2 * Math.PI * i) / 100; //Smaller the value at place of 100, more is the spacing degree (360/n deg)

			int x = (int) Math.round(xO + r * Math.cos(theta));
			int y = (int) Math.round(yO + r * Math.sin(theta)); 
			plot[y][x] = '@';
		}

		for(char[] q : plot) {
			for(char e : q) {
				System.out.print(e);
			} System.out.println();
		}
	}
}