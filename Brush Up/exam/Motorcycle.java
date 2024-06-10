package CarRent;

public class Motorcycle implements Vehicle{
	@Override
	public boolean rent(int days) {
		System.out.println("오토바이를 렌탈합니다. 렌탈 기간: " + days + "일");
		return true;
	}
}
