package librarys;

public class Magazine implements Book{

	@Override
	public boolean borrow(int days) {
		System.out.println("잡지를 대출합니다. 대출 기간: " + days);
		return true;
	}

}
