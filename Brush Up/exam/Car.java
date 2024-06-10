package CarRent;

public class Car implements Vehicle{
	@Override
	public boolean rent(int days) {
		System.out.println("차량을 렌탈합니다. 렌탈 기간: " + days + "일");
		return true;
	}

}
