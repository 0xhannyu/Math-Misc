import java.io.IOException;
import java.util.Arrays;

public class MtCircle {
	
    public static void main(String[] args) throws InterruptedException, IOException {

        double scale = 1;
        int r = (int) (30 * scale); // Radius
        int xO = (int) (30 * scale), yO = (int) (15 * scale); // Centre coords of the circle
        int size = (int) (2200 * scale);
        String chars = ".,-~:;=!*|i><~+$@";
        
        while (true) {
            char[] plot = new char[size];
            Arrays.fill(plot, ' ');

            for (int i = 0; i < 1000; i++) {
                double theta = (2 * Math.PI * i) / 100; // Smaller the value at place of 100, more is the spacing degree (360/n deg)
                int rand = (int) (Math.random() * r);
                int x = (int) (xO + rand * Math.cos(theta));
                int y = (int) (yO + rand * Math.sin(theta)/2);
                double distance = Math.sqrt((x - xO) * (x - xO) + (y - yO) * (y - yO));
                int brightness = (int) (255 - distance / r * 255);
                plot[y * (xO * 2) + x] = chars.charAt((int) (brightness / 50));
            }

            for (int i = 0; i < size; i++) {

            	System.out.print(plot[i]);

            	if ((i + 1) % (xO * 2) == 0)
            		System.out.println();
            }

            Thread.sleep(5);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }
}