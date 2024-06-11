package librarys;

public class DefaultBook implements Book{

	@Override
	public boolean borrow(int days) {
		System.out.println("해당 도서 유형이 없습니다.");
		return false;
	}
	
}
