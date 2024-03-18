package traffic_management;

public class CarCounter implements NumberOfCars {

	private int carCount = 0;
	
	public void increment() {
		carCount++;
	}
	
	public void decrement() {
		carCount--;
	}
	
	public int getCount() {
		return carCount;
	}

}
