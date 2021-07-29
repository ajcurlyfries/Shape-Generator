package twoD;
import java.awt.*;
/* Project 2
 * Circle.java
 * Andora Zuniga
 * April 9th 2020
 * This class defines the circle
 */

public class Circle extends Component{
	private int radius;

	//method to set radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//overriding the paint method
	public void paint( Graphics g ) {
		g.fillOval(175, 285, radius, radius);;
	}
	
}
