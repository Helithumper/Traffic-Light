import java.util.Scanner;

import javax.swing.JFrame;


public class Runner {

	public static void main(String[] args) {
		/*Bulb bulb1 = new Bulb(true);
		//Must define color name or else null
		System.out.println(bulb1.toString());
		Bulb bulb2 = new Bulb(true, "RED");
		bulb2.setColorName("yellow");
		System.out.println(bulb2.toString());
		//Creates an instance of a Traffic light
		TrafficLight light = new TrafficLight();
		System.out.println(light.getLights()[0].getColor()); GETS RGB OF LIGHT 0
		//light automatically becomes toStrings()
		//Calling nextState() will change the light color, so it is a mutator
		light.nextState();
		System.out.println(light);*/
		
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficLightPanel());
		frame.pack();
		frame.setVisible(true);
		
			
		

	}

}
