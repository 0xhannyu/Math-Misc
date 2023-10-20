#include <iostream>
#include <cmath>
#include <cstring>

using namespace std;

int main() {

	int r = 20;
	int xC = 20, yC = 10;
	int size = 1200;

	string chars = ".,-~:;=!*#$@"; // Greyscale Char Sequence

	while(true) {
		char plot[size];
		memset(plot, ' ', sizeof(plot)); // Initialize the 1D-Array with whitespace literals
										// Use 1D-Array instead of 2D-Array for increasing speed

		for (int i = 0; i < 1000; i++) {
			double theta = (2 * M_PI * i) / 100;
			int n = (int) ((rand() % 100) * r) / 100; // For visual effect
			int x = (int) (xC + n * cos(theta));
			int y = (int) (yC + n * sin(theta)/2);
			double distance = sqrt((x - xC) * (x - xC) + (y - yC) * (y - yC));
			int brightness = (int) (255 - distance / r * 255);

			plot[y * (xC * 2) + x] = chars.at((int) (brightness / 50));
		}

		for (int i = 0; i < size; i++) {
			cout << plot[i];

			if ((i + 1) % (xC * 2) == 0) // Check for Edge
				cout << "\n";
		}
		system("cls");
	}
	return 0;
}