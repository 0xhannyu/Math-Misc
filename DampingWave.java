import java.util.Arrays;
import java.io.*;

class DampingWave {

	public static void main(String[] args) throws IOException {
		
		//y(x, t) = A sin(kx - ωt + φ)

		char[][] plot = new char[300][201];
		for(int i = 0; i < 300; i++)
			for(int j = 0 ; j < 201; j++)
				plot[i][j] = ' ';


		/*
			t - time
			amp - wave amplitude
			phi - phase
			w - angular frequency (ω = 2πf)
			k - wave number (k = 2π/λ)
			dmp - damping constant
		*/

		double t = 0, amp = 100, phi = 0;
		double w = Math.PI*2, k = Math.PI*2, dmp = 1;
		int yO = 100, y = 0;

		for(int x = 0; x < 300; x++) {

			y = (int)(amp * Math.pow(Math.E, -(dmp * t)) * Math.sin((Math.PI*((k * x) - (w * t) + phi))/180));

			t = t + 0.0045;

			if(y > 0) {

				y = yO + y;

			}

			if(y < 0) {

				y = yO + y;

			}

			if(y == 0) {

				y = yO;

			}

			//System.out.println(x+"\t"+y);

			plot[x][y] = '@';
		}

		FileWriter wrt = new FileWriter("C:\\Users\\dell\\Desktop\\wave.txt");

		for(char[] q : plot) {

			for(char e : q) {

				wrt.write(e);

			} wrt.write("\n");
		}

		wrt.close();
	}
}
