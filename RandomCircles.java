/*
 * This program will draw 10 circles of random position, size, and color. 
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	private RandomGenerator random = RandomGenerator.getInstance();

	// The constants for radius size and number of circles.
	private static final int NUMBER_CIRCLES = 10;
	private static final int MIN_RADIUS = 5;
	private static final int MAX_RADIUS = 50;
	
	public void run() {
		for(int i = 0; i < NUMBER_CIRCLES; i++) {
		double radius = random.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double x = random.nextDouble(0, getWidth() - 2 * radius);
		double y = random.nextDouble(0, getHeight() - 2 * radius);
		GOval circle = new GOval(x, y, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(random.nextColor());
		add(circle);	
		}
	}
}
