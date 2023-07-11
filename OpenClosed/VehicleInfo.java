package OpenClosed;

public class VehicleInfo {
	public double vehicleNumber(Vehicle vcl)
	{
		if(vcl instanceof Car)
		{
			return vcl.getNumber();
		}
		
		if(vcl instanceof Bike)
		{
			return vcl.getNumber();
		}
	}
	
	/* The open-closed principle states that according to new requirements the module should be open
	 * for extension but closed for modification. The extension allows us to implement new functionality
	 * to the module.
	 * 
	 * If we want to add another subclass named Truck, simply, we add one more if statement that
	 * violates the open-closed principle. The only way to add the subclass and achieve the goal of 
	 * principle by overriding the vehicleNumber() method, shown in the VehicleInfo2.java file.
	 */ 
}
