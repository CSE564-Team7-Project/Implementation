package traffic_management;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the traffic management system.
 * Have a TrafficController with a list of TrafficLights aggregated.
 * Have the CarCounter increment the number of cars for each direction slowly.
 * Threads? No. 
 */
public class Main {
    public static void main(String[] args) {
        TrafficController trafficController = new TrafficController();
        TrafficLight eastboundLight = new TrafficLight();
        TrafficLight southboundLight = new TrafficLight();
        CarCounter eastcars = new CarCounter();
        CarCounter southcars = new CarCounter();

        // add lights to a list
        List<TrafficLight> lights = new ArrayList<TrafficLight>();
        lights.add(eastboundLight);
        lights.add(southboundLight);
        List<Integer> cars = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            cars.clear(); cars.add(eastcars.getCount()); cars.add(southcars.getCount());


            if (i % 2 == 0 && eastboundLight.getColor() == Color.RED) {
                eastcars.increment(3);
            }
            else if(eastboundLight.getColor() == Color.GREEN) {
                eastcars.decrement();
            }
            
            if (i % 3 == 0 && southboundLight.getColor() == Color.RED){
                southcars.increment(2);
            }
            else if(southboundLight.getColor() == Color.GREEN) {
                southcars.decrement();
            }

            trafficController.compareLights(cars, lights);
            System.out.print("Eastbound: " + eastboundLight.getColor() + " Southbound: " + southboundLight.getColor());
            System.out.println(" Eastbound cars: " + eastcars.getCount() + " Southbound cars: " + southcars.getCount());
        }
    }
}
