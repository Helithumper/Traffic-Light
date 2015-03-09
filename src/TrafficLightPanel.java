import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TrafficLightPanel extends JPanel{
	//instance Fields
	private TrafficLight light;
	private int scale = 1;
	private final int X = 60*scale, Y = 50*scale, WIDTH = 50*scale, HEIGHT = 170*scale;
	private final int DIAMETER = 30*scale;
	private final int X_OFFSET = 10*scale, Y_OFFSET = 10*scale;
	private ImageIcon rightArrow;
	private JLabel imageLabel;
	
	//Constructor
	public TrafficLightPanel() {
		light = new TrafficLight();
		
		JButton chngBtn = new JButton("Change Light");
		chngBtn.addActionListener(new ChangeListener());
		add(chngBtn);
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(170,270));
		rightArrow = new ImageIcon("Black_Down_Arrow.png");
		imageLabel = new JLabel(rightArrow);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		add(imageLabel);
	}
	//Methods
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		//draws the rectangle
		page.setColor(Color.LIGHT_GRAY);
		page.fillRect(X, Y, WIDTH, HEIGHT);
		//draws the red light
		if(light.indexofLitBulb() == 0) {
			page.setColor(Color.RED);
		}
		else {page.setColor(Color.DARK_GRAY);
		}
		//Draws the yellow Light
		page.fillOval(X+X_OFFSET, Y+Y_OFFSET, DIAMETER, DIAMETER);
		if(light.indexofLitBulb() == 1) {
			page.setColor(Color.YELLOW);
		}
		else {page.setColor(Color.DARK_GRAY);
		}
		page.fillOval(X+X_OFFSET, Y+DIAMETER+2*Y_OFFSET, DIAMETER, DIAMETER);	
		//draws the green light
		if(light.indexofLitBulb() == 2) {
			page.setColor(Color.GREEN);
		}
		else {page.setColor(Color.DARK_GRAY);}
		page.fillOval(X+X_OFFSET, Y+2*DIAMETER+3*Y_OFFSET,DIAMETER,DIAMETER);
		//draws the green turn light
		//FIGURE OUT RIGHT BUTTON DRAWING
		if(light.indexofLitBulb() == 3) {
			page.setColor(Color.PINK);
			//imageLabel.revalidate();
			//add(imageLabel);
			}
		else {page.setColor(Color.DARK_GRAY);
		//imageLabel.setIcon(null);
		}
		page.fillOval(X+X_OFFSET, Y+3*DIAMETER+4*Y_OFFSET,DIAMETER,DIAMETER);
	}//end of method
	
	private class ChangeListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			light.nextState();
			repaint();
		}
	}
	

}
