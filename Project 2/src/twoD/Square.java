package twoD;
/* Project 1
 * Square.java
 * Andora Zuniga
 * April 9th 2020
 * This class defines a square
 */

import java.awt.*;
import java.awt.Graphics;

public class Square extends Component {
	private int sideLength;

	//setters 
	public void setLength(int length) {
		this.sideLength = length;
	}
	
	//overriding the paint method
	public void paint(Graphics g) {
		g.fillRect(175, 285, sideLength, sideLength);
	}
}
