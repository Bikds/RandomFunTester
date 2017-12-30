
/*
 * @author BikDS
 * September 6, 2017
 * This class draws three circles at different positions with different colors
 */

import apcslib.*;
import java.awt.Color;;

public class DrawCircles {
	private DrawingTool pen;
	private SketchPad canvas;
	private int myRadius;

	public DrawCircles(int radius) {
		canvas = new SketchPad(500, 500);
		pen = new DrawingTool(canvas);
		myRadius = radius;
	}

	public void draw() {
		pen.up();
		pen.move(0, 0);
		pen.down();
		pen.setColor(Color.BLUE);
		pen.fillOval(myRadius, myRadius);
		pen.up();
		pen.move(-75, -75);
		pen.down();
		pen.setColor(Color.GREEN);
		pen.fillOval(myRadius, myRadius);
		pen.up();
		pen.move(100, 50);
		pen.down();
		pen.setColor(Color.MAGENTA);
		pen.fillOval(myRadius, myRadius);
	}

}
