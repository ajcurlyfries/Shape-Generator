package twoD;

import java.awt.*;

/* Project 2
 * Rectangle.java
 * Andora Zuniga
 * April 9th 2020
 * This class defines the Rectangle
 */

public class Rectangle extends Component {
	private int length, width;

	//setters 
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	//overriding the paint method
	public void paint(Graphics g) {
		g.fillRect(175, 285, length, width);
	}
	
}
