package CarRent;

public class RentMain {
	public static void main(String[] args) {
		RentalService rentalService = new RentalService();
		
		String option1 = "car";
		int days1 = 3;
		rentalService.proccessRental(option1, days1);
		
		String option2 = "truck";
		int days2 = 4;
		rentalService.proccessRental(option2, days2);
		
		String option3 = "bus";
		int days3 = 5;
		rentalService.proccessRental(option3, days3);
	}
}
