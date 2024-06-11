package librarys;

public class FictionBook implements Book{

	@Override
	public boolean borrow(int days) {
		System.out.println("소설책을 대출합니다. 대출 기간: " + days);
		return true;
	}

}
