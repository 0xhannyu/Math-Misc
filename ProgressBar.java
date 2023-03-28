import java.util.Random;

class ProgressBar {

	void progressBar(int p) {

		Random rand = new Random();

		try {

			for(int i = 0 ; i <= p ; i++) {

				Thread.sleep(rand.nextInt(200));
				System.out.print(i + " % | " + "=".repeat(i) + "\r");
			}

		} catch(Exception e) { System.out.print(e);}
	}

	public static void main(String[] args) {

		ProgressBar pb = new ProgressBar();

		pb.progressBar(100);
	}
}