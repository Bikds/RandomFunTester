
/*
 * @author BikDS
 * September 6, 2017
 * This file creates a house 
 */

import apcslib.*;
import java.awt.Color;

public class DrawHouse {
	private DrawingTool pen;
	private SketchPad paper;

	public DrawHouse() {

		paper = new SketchPad(500, 500);
		pen = new DrawingTool(paper);
	}
	
	public void draw() {
		house();
		paintWall();
		door();
		roof();
		leftWindow();
		rightWindow();
		knob();
		grass();
	}

	/*
	 * Cool features are paint of the wall, window frame and lines through window,
	 * door knob, grass, color of the door
	 */
	public void house() {
		pen.up();
		pen.move(-200, -125);
		pen.down();
		pen.setWidth(5);
		pen.move(200, -125);
		pen.move(200, 125);
		pen.move(-200, 125);
		pen.move(-200, -125);
	}

	// paint wall of the home
	public void paintWall() {
		pen.up();
		pen.move(0, 0);
		pen.down();
		pen.setColor(Color.YELLOW);
		pen.fillRect(400, 250);
	}

	// draw the door
	public void door() {
		pen.up();
		pen.move(-37, -125);
		pen.setWidth(10);
		pen.setColor(Color.BLUE);
		pen.down();
		pen.move(-37, 0);
		pen.move(37, 0);
		pen.move(37, -125);
		pen.up();
		pen.move(0, -63);
		pen.down();
		pen.setColor(Color.GRAY);
		pen.fillRect(74, 125);
	}

	// draw the roof
	public void roof() {
		pen.up();
		pen.setColor(Color.black);
		pen.setWidth(8);
		pen.move(200, 125);
		pen.down();
		pen.move(0, 200);
		pen.move(-200, 125);
	}

	// draw the window
	// left window
	public void leftWindow() {
		pen.up();
		pen.move(-125, 25);
		pen.setColor(Color.BLUE);
		pen.down();
		pen.drawCircle(30);
		pen.fillOval(60, 60);
		// draw the line through the window
		pen.up();
		pen.move(-125, 55);
		pen.setWidth(2);
		pen.setColor(Color.BLACK);
		pen.down();
		pen.move(-125, -10);
		pen.up();
		pen.move(-157, 23);
		pen.down();
		pen.move(-92, 23);
	}

	// right window
	public void rightWindow() {
		pen.up();
		pen.move(125, 25);
		pen.setColor(Color.BLUE);
		pen.down();
		pen.drawCircle(30);
		pen.fillOval(65, 65);
		// draw the line through the window
		pen.up();
		pen.move(125, 55);
		pen.setWidth(2);
		pen.setColor(Color.BLACK);
		pen.down();
		pen.move(125, -5);
		pen.up();
		pen.move(157, 23);
		pen.down();
		pen.move(95, 23);
	}

	// door knob
	public void knob() {
		pen.up();
		pen.move(-25, -62.5);
		pen.down();
		pen.setColor(Color.BLACK);
		pen.fillOval(10, 10);
	}

	// grass
	public void grass() {
		pen.up();
		pen.move(-250, -129);
		pen.down();
		pen.setWidth(2);
		pen.setColor(Color.GREEN);
		pen.move(250, -129);
		pen.up();
		pen.move(0, -190);
		pen.down();
		pen.fillRect(500, 129);
	}
}
