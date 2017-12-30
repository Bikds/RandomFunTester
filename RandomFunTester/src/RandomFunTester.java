
/*
 * @author BikDS
 * September 6, 2017
 * This class generates a random number and then creates a square, a house, or a circle
 */

import java.util.Random;

public class RandomFunTester {

	public static void main(String[] args) {
		Random choose = new Random();
		int drawNumber = choose.nextInt(3) + 1;

		switch (drawNumber) {
		case 1:
			DrawHouse house = new DrawHouse();
			house.draw();
			break;
		case 2:
			DrawSquare sq = new DrawSquare();
			sq.draw();
			break;
		case 3:
			int radius = choose.nextInt(31) + 20;
			DrawCircles circle = new DrawCircles(radius);
			circle.draw();
			break;
		default:
			System.out.println("Error message");
		}
	}

}
