package threeD;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/* Project 2
 * Cone.java
 * Andora Zuniga
 * April 9th 2020
 * This class defines the cone shape
 */
public class Cone {
	//variables
	private int height, radius;
	private ImageIcon icon;
	
	//setters for height and radius
	public void setHeight(int height) {
		this.height = height;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public ImageIcon getIcon() {
		return this.icon;
	}
	//draw cone
	public JLabel drawCone() {
		JLabel rVal = null;
		icon = new ImageIcon(
                new ImageIcon("transparent_cone.png").getImage()
                        .getScaledInstance(this.radius, this.height,
                                Image.SCALE_DEFAULT));
        rVal = new JLabel(icon);
		return rVal;
	}
}
