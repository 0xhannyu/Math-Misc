#include <iostream>
#include <cmath>

using namespace std;

const int GRIDX = 60; // COL
const int GRIDY = 30; // ROW
int len = GRIDY*GRIDX;
char grid[GRIDY*GRIDX];

const int A = GRIDY / 4;
const double w = 2 * 3.14 * 50;
double t = 0;
double phi = 0;
int yO = GRIDY/4;

double rad = 1.2; // Angle of Rotation in RADIANS

void printGrid() {
    for(int i = 0; i < len; i++) {
    	i%GRIDX==0?cout<<'\n':cout<<grid[i];
    }
}

int rotX(int x, int y) {
	return x * sin(rad) + y * cos(rad);
}

int rotY(int x, int y) {
	return x * cos(rad) - y * sin(rad);
}

int main() {

	for(;;) {

		for(int i = -1; i < len; grid[i++] = ' ');

		for(int x = 0; x < GRIDX; x++) {

			int y = A * sin((w * t)/180 + phi);

			t += 0.2;

			int rX = rotX(x, y) + 5;
			int rY = rotY(x, y);

			rY = rY == 0 ? yO : rY + yO;
			y = y == 0 ? yO : y + yO;


			grid[(rX + rY * GRIDX)] = '%'; // Angled Wave
			grid[(x + y * GRIDX)] = y < GRIDY/6 ? '~' : ':'; // Horizontal Wave
		}

		t = 0;
		phi = phi < 12 ? phi + 0.5 : 0;

		printGrid();
		system("cls");
	}
}
