/* Project 2
 * ShapesGUI.java
 * Andora Zuniga
 * April 9th, 2020
 * This class defines the gui for a shape generator program 
 */
package main;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import twoD.*;
import twoD.Rectangle;
import threeD.*;

public class ShapesGUI {

	private JFrame frmShapeGenerator;
	//textfields and labels for input
	private JTextField circleRadius;
	private JTextField squareLength;
	private JTextField width;
	private JTextField height;
	private JLabel lblRadius = new JLabel("Radius:");
	private JLabel lblSideLength = new JLabel("Length:");
	private JLabel lblWidth = new JLabel("Width:");
	private JLabel lblHeight = new JLabel("Height:");
	private Boolean wasUsed;
	
	
	private JLabel display;
	Circle myCircle = new Circle();
	Square mySquare = new Square();
	Rectangle myRectangle = new Rectangle();
	Sphere mySphere = new Sphere();
	Cube myCube = new Cube();
	Cone myCone = new Cone();
	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapesGUI window = new ShapesGUI();
					window.frmShapeGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the application.
	public ShapesGUI() {
		initialize();
		wasUsed = false;
	}

	 //Initialize the contents of the frame.
	private void initialize() {
		frmShapeGenerator = new JFrame();
		frmShapeGenerator.getContentPane().setBackground(new Color(255, 240, 245));
		frmShapeGenerator.setTitle("Shape Generator");
		frmShapeGenerator.setBounds(100, 100, 420, 435);
		frmShapeGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShapeGenerator.getContentPane().setLayout(null);
		
		JLabel lblPickAShape = new JLabel("Pick a Shape:");
		lblPickAShape.setBounds(78, 33, 114, 22);
		frmShapeGenerator.getContentPane().add(lblPickAShape);
		
		//when user selects a shape display appropriate dimension input areas
		JComboBox shapeSelect = new JComboBox();
		shapeSelect.setBounds(197, 32, 149, 24);
		shapeSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( wasUsed ) {
					JOptionPane.showMessageDialog(null, "Please refresh the page",
						      "Error", JOptionPane.ERROR_MESSAGE);
				}
				String selection = (String)shapeSelect.getSelectedItem();
				if ( selection.equals( "Circle" ) ) {
					//generate new fields
					lblRadius.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblRadius);
					lblRadius.setVisible(true);
					circleRadius = new JTextField();
					circleRadius.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(circleRadius);
					frmShapeGenerator.repaint();
					circleRadius.setColumns(10);
					wasUsed = true;
				} else if( selection.equals( "Square" )) {//remove other input fields
					//generate new fields
					lblSideLength.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblSideLength);
					lblSideLength.setVisible(true);
					squareLength = new JTextField();
					squareLength.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(squareLength);
					frmShapeGenerator.repaint();
					squareLength.setColumns(10);
					wasUsed = true;
				} else if( selection.equals( "Rectangle" )) {
					//generate new fields
					lblSideLength.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblSideLength);
					lblSideLength.setVisible(true);
					squareLength = new JTextField();
					squareLength.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(squareLength);
					lblWidth.setBounds(106, 140, 70, 15);
					frmShapeGenerator.getContentPane().add(lblWidth);
					lblWidth.setVisible(true);
					width = new JTextField();
					width.setBounds(211, 140, 114, 19);
					frmShapeGenerator.getContentPane().add(width);
					frmShapeGenerator.repaint();
					squareLength.setColumns(10);
					width.setColumns(10);
					wasUsed = true;
				} else if( selection.equals( "Sphere" )) {
					//generate new fields
					lblRadius.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblRadius);
					lblRadius.setVisible(true);
					circleRadius = new JTextField();
					circleRadius.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(circleRadius);
					frmShapeGenerator.repaint();
					circleRadius.setColumns(10);
					wasUsed = true;
				} else if( selection.equals( "Cube" )) {
					//generate new fields
					lblSideLength.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblSideLength);
					lblSideLength.setVisible(true);
					squareLength = new JTextField();
					squareLength.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(squareLength);
					frmShapeGenerator.repaint();
					squareLength.setColumns(10);
					wasUsed = true;
				} else if( selection.equals( "Cone" )) {
					//generate new fields
					lblRadius.setBounds(106, 116, 70, 15);
					frmShapeGenerator.getContentPane().add(lblRadius);
					lblRadius.setVisible(true);
					circleRadius = new JTextField();
					circleRadius.setBounds(211, 114, 114, 19);
					frmShapeGenerator.getContentPane().add(circleRadius);
					lblHeight.setBounds(106, 140, 70, 15);
					frmShapeGenerator.getContentPane().add(lblHeight);
					lblHeight.setVisible(true);
					height = new JTextField();
					height.setBounds(211, 140, 114, 19);
					frmShapeGenerator.getContentPane().add(height);
					height.setColumns(10);
					frmShapeGenerator.repaint();
					wasUsed = true;
				}
			}
		});
		String[] shapes = new String[]{"Circle", "Square", "Rectangle", "Sphere", "Cube", "Cone"};
		shapeSelect.setModel(new DefaultComboBoxModel(shapes));
		shapeSelect.setToolTipText("");
		frmShapeGenerator.getContentPane().add(shapeSelect);
		
		//addRefresh button
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(150, 70, 120, 25);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            frmShapeGenerator.removeAll();
	            wasUsed = false;
				initialize();
			}
		});
		frmShapeGenerator.getContentPane().add(btnRefresh);
		frmShapeGenerator.setVisible(true);
		
		//when generate shape is clicked
		JButton btnGenerateShape = new JButton("Generate Shape");
		btnGenerateShape.setBounds(129, 185, 158, 25);
		btnGenerateShape.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selection = (String)shapeSelect.getSelectedItem();
				if ( selection.equals( "Circle" ) ) {
					try {
						myCircle.setRadius( Integer.parseInt( circleRadius.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					myCircle.paint( frmShapeGenerator.getGraphics() );
				} else if( selection.equals( "Square" )) {
					try {
						mySquare.setLength( Integer.parseInt( squareLength.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					mySquare.paint( frmShapeGenerator.getGraphics() );
				} else if( selection.equals( "Rectangle" )) {
					try {
						myRectangle.setLength( Integer.parseInt( squareLength.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					try {
						myRectangle.setWidth( Integer.parseInt( width.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					myRectangle.paint( frmShapeGenerator.getGraphics() );
				} else if( selection.equals( "Sphere" )) {
					try {
						mySphere.setRadius( Integer.parseInt( circleRadius.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					display = mySphere.drawSphere();
					display.setVisible(true);
                    display.getIcon().paintIcon(display, frmShapeGenerator.getGraphics(), 175, 285);
				} else if( selection.equals( "Cube" )) {
					try {
						myCube.setSideLength( Integer.parseInt( squareLength.getText() ) );
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					display = myCube.drawCube();
					display.setVisible(true);
                    display.getIcon().paintIcon(display, frmShapeGenerator.getGraphics(), 175, 285);
				} else if( selection.equals( "Cone" )) {
					try {
						myCone.setRadius(Integer.parseInt( circleRadius.getText() ));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);					}
					try {
						myCone.setHeight(Integer.parseInt( height.getText() ));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Invalid input",
							      "Error", JOptionPane.ERROR_MESSAGE);
					}
					display = myCone.drawCone();
					display.setVisible(true);
                    display.getIcon().paintIcon(display, frmShapeGenerator.getGraphics(), 175, 285);
				}
			}
		});
		frmShapeGenerator.getContentPane().add(btnGenerateShape);
		frmShapeGenerator.setVisible(true);
		
	}
}
