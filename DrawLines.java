/*
 * This program will allow users to click and drag with
 * their mouse to create a line on the graphics program.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawLines extends GraphicsProgram {
	
	private GLine line;
	
	public void run() {
		addMouseListeners();
	}
	
	// This will create a new line when the user presses and drags the mouse.
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	
	// This will set the end point when the user lets go of the mouse.
	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
	}

}
