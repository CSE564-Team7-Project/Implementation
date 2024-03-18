package traffic_management;

import java.util.List;

public class TrafficController {
	// there are only two lights for now. 

	public void compareLights(List<Integer> cars, List<TrafficLight> lights) {
		if (cars.get(0) >= cars.get(1) + 3 || cars.get(1) == 0) {
			lights.get(0).setColor(Color.GREEN);
			lights.get(1).setColor(Color.RED);
		}
		else if(cars.get(1) >= cars.get(0) + 3 || cars.get(0) == 0) {
			lights.get(1).setColor(Color.GREEN);
			lights.get(0).setColor(Color.RED);
		}
	}
}
