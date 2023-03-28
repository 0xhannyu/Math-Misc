/*

Prints different patterns on console.
Some of them also require parameters passed through method.
Pass 0 0 if no parameters are needed.

*/

import java.util.HashMap;
import java.util.Random;

class Accidental {

	void laScPatternOne(int n) {

		for(int i = 0 ; i <= n ; i++) {

			for(int j = 0 ; j <= i ; j++) {

				for(int k = 0 ; k <=j ; k++) {

					System.out.print("#".repeat(j)+"*".repeat(j));

				} System.out.println();
			}
		}


		for(int i = n ; i >= 0 ; i--) {

			for(int j = i ; j >= 0 ; j--) {

				for(int k = j ; k >= 0 ; k--) {

					System.out.print("#".repeat(j)+"*".repeat(j));

				} System.out.println();
			}
		}
	}

	void rayDispersePatternOne(int n) {

		for(int i = 0 ; i <= n ; i++) {

			for(int j = 0 ; j <= i ; j++) {

				for(int k = 0 ; k <= j ; k++) {

					System.out.print(" ".repeat(i)+"#".repeat(j));

				} System.out.println();
			}
		}
	}

	void ribbonPattern(int n) {

		int i, f = n + 3;

		for(i = 0 ; i <= n ; i++) {

			System.out.print(" ".repeat(i) + "*".repeat(f) + "\n");

			f -= 2;

			if(f < 0) {

				f = n/2;

				for(i = 3 ; i <= n + 3 ; i += 2) {

					System.out.print(" ".repeat(f) + "*".repeat(i) + "\n");
					
					f--;

					if(f < 0) {

						ribbonPattern(n-1);
					}
				}
			}
		}
	}

	void sinWave() {

		int n;

		for(int i = 0 ; i <= 360 ; i++) {

			n = (int) (Math.sin((3.14*i)/180)*100);

			if(n > 0) {
				System.out.print(" ".repeat(99) + "@".repeat(n) + "\n");
			}
			if(n < 0) {
				System.out.print(" ".repeat(99-Math.abs(n)) + "@".repeat(Math.abs(n)) + "\n");
			}
			if(n == 0) {
				System.out.print(" ".repeat(99)+"*\n");
			}
		}
	}

	double sgn(double val) {

		if(val>0){ return 1;}
		if(val<0){ return -1;}
		else{ return 0;}
	}

	void tanWave() {

		int n;

		for(int i = 0 ; i <= 360 ; i++) {

			n = (int) Math.floor((sgn(Math.cos(2*3.14*i/32)))*Math.sin(2*3.14*i/32)*32/(Math.sqrt(Math.pow((Math.cos(2*3.14*i/32)), 2)+0.02)));

			if(n > 0) {
				System.out.print(" ".repeat(299) + "@".repeat(n) + "\n");
			}
			if(n < 0) {
				System.out.print(" ".repeat(299 - Math.abs(n)) + "@".repeat(Math.abs(n)) + "\n");
			}
			if(n == 0) {
				System.out.print(" ".repeat(299) + "*\n");
			}
		}
	}

	void trianglesRan(int n) {

		int i;

		if(n > 0) {

			for(i = 0 ; i <= n ; i++) {

				System.out.print(" ".repeat(i) + "\\\n");
			}

			for(i = n ; i >= 0 ; i--) {

				System.out.print(" ".repeat(i) + "/\n");
			}

			trianglesRan(n-1);
		}
	}

	public static void main(String args[]) {

		Accidental ob = new Accidental();

		int n = 0;

		if(args[1] != null) { n = Integer.valueOf(args[1]); }
		else { n = 10; }

		switch(args[0]) {

		case "1" :

			ob.laScPatternOne(n);

			break;

		case "2" :

			ob.rayDispersePatternOne(n);

			break;

		case "3" :

			ob.ribbonPattern(n);

			break;

		case "4" :

			ob.sinWave();

			break;

		case "5" :

			ob.tanWave();

			break;

		case "6" :

			ob.trianglesRan(n);

			break;
		}
	}
}
