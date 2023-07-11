package LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(new MotorCycle());
		vehicleList.add(new Car());
		vehicleList.add(new Bicycle()); // this will throw null pointer exception
		
		for(Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.hasEngine().toString());
		}
		
		/*
		 * Liskov principle says that all the child classes should be able to 
		 * substitute each other without breaking the code.
		 * 
		 * This code causes the Null Pointer Exception that I've mentioned above
		 * 
		 * This can be solved by only using generic method in the parent class, rather than
		 * using a lot of methods and then overriding it. check the LiskovSubstitutionSolution package
		 * for more info.
		 */

	}

}
