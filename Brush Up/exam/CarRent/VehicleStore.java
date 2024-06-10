package CarRent;

public class VehicleStore {
	public static Vehicle FindVehicle(String option) {
		if (option.equals("car")) {
			return new Car();
		} else if (option.equals("Truck")) {
			return new Truck();
		} else if (option.equals("Motorcycle")){
			return new Motorcycle();
		} else {
			return new DefaultVehicle();
		}
	}
}
