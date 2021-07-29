package threeD;
/* Project 1
 * Sphere.java
 * Andora Zuniga
 * March 27th 2020
 * This class defines the shape object sphere
 */

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sphere extends ThreeDimensionalShape {
	//variables
	private int radius;
	private ImageIcon icon;
	
	//method to set radius
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public ImageIcon getIcon() {
		return this.icon;
	}
	
	//draw cone
	public JLabel drawSphere() {
		JLabel rVal = null;
		icon = new ImageIcon(
                new ImageIcon("sphere.png").getImage()
                        .getScaledInstance(this.radius, this.radius,
                                Image.SCALE_DEFAULT));
        rVal = new JLabel(icon);
		return rVal;
	}
}
