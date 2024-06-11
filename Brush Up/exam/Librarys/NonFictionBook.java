package librarys;

public class NonFictionBook implements Book{

	@Override
	public boolean borrow(int days) {
		System.out.println("비소설책을 대출합니다. 대출 기간: " + days);
		return true;
	}
	
}
