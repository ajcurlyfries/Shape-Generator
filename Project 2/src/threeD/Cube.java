package threeD;
/* Project 1
 * Cube.java
 * Andora Zuniga
 * March 27th 2020
 * This class defines the shape object Cube
 */

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cube extends ThreeDimensionalShape{
	//variables
	private int sideLength;
	private ImageIcon icon;
	
	//draw cube
	public JLabel drawCube() {
		JLabel rVal = null;
		icon = new ImageIcon(
                new ImageIcon("cube.png").getImage()
                        .getScaledInstance(this.sideLength, this.sideLength,
                                Image.SCALE_DEFAULT));
        rVal = new JLabel(icon);
		return rVal;
	}	
	//method to set sideLength 
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	public ImageIcon getIcon() {
		return this.icon;
	}
}
