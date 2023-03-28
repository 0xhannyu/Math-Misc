/*

Displays a Main-method passed String in a cool way

*/

import java.util.Random;

class CSE {

	public static void main(String[] args) throws InterruptedException {

		String str = args[0];

		String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890-=[];'\\,./<>:\"{}|+_)(*&^%$#@!~`";
		
		Random rand = new Random();
		
		for(int i = str.length()-1 ; i >= 0 ; i--) {

			Thread.sleep(rand.nextInt(100));

			for(int j = i + 1 ; j > 1 ; j--) {

				System.out.print(chars.charAt(rand.nextInt(chars.length())));
			}

			System.out.print(str.charAt(i) + "\r");
		}
	}
}