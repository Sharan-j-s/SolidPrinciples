package OpenClosed;

public class VehicleInfo2 {
	public double vehicleNumber() {
		System.out.print("Functionality...");
	}
}


public class Car extends VehicleInfo{
	public double vehicleNumber() {
		return this.getValue();
	}
}


public class Truck extends VehicleInfo{
	public double vehicleNumber() {
		return this.getValue():
	}
}

// Similiarly we can add more vehicles by making another subclass extending from the vehicle class.
// The approach would not affect the existing application.
