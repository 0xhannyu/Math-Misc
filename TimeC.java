class TimeC {

	public static void main(String args[]) {

		long t1,t2,t3,t4;

		t1 = System.nanoTime();

		for(int i = 0 ; i < 5 ; i++) {

			for(int j = 0 ; j <= i ; j++) {

				System.out.print("* ");

			} System.out.println();
		}

		t2=System.nanoTime();


		t3=System.nanoTime();

		System.out.println("* ");
		System.out.println("* * ");
		System.out.println("* * * ");
		System.out.println("* * * * ");
		System.out.println("* * * * * ");

		t4=System.nanoTime();

		
		System.out.println("1st Method took "+(t2-t1)+"ns");
		System.out.println("2nd Method took "+(t4-t3)+"ns");

	}
}