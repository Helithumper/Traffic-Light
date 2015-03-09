import java.awt.Color;
import java.util.Arrays;
public class TrafficLight {
		// instance fields
	//array to hold bulbs in our traffic lights
	private Bulb[] lights;
	
		//constructor
	public TrafficLight(){
		//sets size of array to 3 Bulbs
		lights = new Bulb[4];
		// creates 3 colored lights and adds them to the array lights
		lights[0]= new Bulb(true, "red", Color.RED);
		lights[1]= new Bulb(false, "yellow",Color.YELLOW);
		lights[2]= new Bulb(false, "green",Color.GREEN);
		lights[3]= new Bulb(false, "green turn",Color.BLACK);
	}
	//assessors
	public Bulb[] getLights() {
		return lights;
	}

	// mutators
	public void setLights(Bulb[] lights) {
		this.lights = lights;
	}
	//changes lights from one state to the next
	public void nextState(){
		//red to green
		if(lights[0].isOn()){ 
			lights[0].turnOff();
			lights[3].turnOn();
		}
		//green to green turn
		else if(lights[3].isOn()){
			lights[3].turnOff();
			lights[2].turnOn();
		}
		// green turn to yellow
		else if(lights[2].isOn()){
			lights[2].turnOff();
			lights[1].turnOn();
		}
		//yellow to red
		else if(lights[1].isOn()){
			lights[1].turnOff();
			lights[0].turnOn();
		}
	}
	
	public int indexofLitBulb(){
		int i = 0;
		while(i < lights.length && lights[i].isOff()){
			i++;
			
		}
		return i;
	}

	//ToString
	public String toString() {
		String result = "";
		for(int k = 0; k < lights.length; k++) {
			result += "Bulb " + (k+1) + " is " + lights[k].getColorName() + " and " + lights[k].toString().toLowerCase() + "\n";
		} //end of loop
		return result;
		//}//End of Conditional
	}//End of Tostring
}//End of Class