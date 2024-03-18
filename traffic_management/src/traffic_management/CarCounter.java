package traffic_management;

public class CarCounter implements NumberOfCars {

	private int carCount = 0;
	
	public void increment() {
		carCount++;
	}

	public void increment(int i) {
		carCount += i;
	}
	
	public void decrement() {
		if (carCount > 0)
			carCount--;
	}
	
	public int getCount() {
		return carCount;
	}

}
