package traffic_management;

public class TrafficLight {
	private Color myColor;

	public TrafficLight() {
		myColor = Color.RED;
	}
	
	public void setColor(Color in) {
		myColor =  in;
	}
	
	public Color getColor() {
		return myColor;
	}
}
