/*Traffic Light Simulation Project
 * By: Peyton Duncan
 * Date: 9/2/2014
 */

import java.awt.Color;

public class Bulb {
	// Instance Fields
	private boolean on;
	private Color color;
	private String colorName;
	//Constructor
	//Works for a regular bulb
	public Bulb(boolean on /*0*/) {
		//on = o;
		this.on = on;
	}
	//Works for a colored bulb in the non-GUI Traffic Light
	public Bulb(boolean on, String cn) {
		this.on = on;
		colorName = cn;
	}
	//Works for the traffic light GUI
	public Bulb(boolean on, String cn, Color c) {
		this.on= on;
		colorName = cn;
		color = c;
	}
	//Assessor Method
	//Determines if on
	public boolean isOn() { return on; }
	//Determines if off
	public boolean isOff() { return !on; }
	//determines color
	public Color getColor() { return color; }
	//returns Color Name
	public String getColorName() {return colorName; }
	
	//Mutators methods
	//sets on
	public void turnOn () {on = true;}
	//sets off
	public void turnOff () {on = false;}
	//sets color of light
	public void setColor(Color c) {color = c;}
	//sets the color name
	public void setColorName(String cn) {colorName = cn;}
	
	//toString()
	public String toString() {
		String result = "";
		if(on) {result = "The " + getColorName() + " light is On!"; }
		else {result = "The " + getColorName() + " light is off"; }
		return result;
	}
}
