package CarRent;

public class DefaultVehicle implements Vehicle{
	@Override
	public boolean rent(int days) {
		System.out.println("해당 유형이 없습니다.");
		return false;
	}
}
