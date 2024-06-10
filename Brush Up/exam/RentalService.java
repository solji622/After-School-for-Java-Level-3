package CarRent;

public class RentalService {
	public void proccessRental(String option, int days) {
		System.out.println("렌탈을 시작합니다: option=" + option + ", days=" + days);
		Vehicle vehicle = VehicleStore.FindVehicle(option);
		boolean result = vehicle.rent(days);
		
		if(result) {
			System.out.println("렌탈 성공");
		} else {
			System.out.println("렌탈 실패");
		}
	}
}
