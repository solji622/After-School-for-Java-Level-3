package librarys;

public class LibraryService {
	public static void proccessBorrow(String option, int days) {
		System.out.println();
		Book book = Library.FindBook(option);
		boolean result = book.borrow(days);
		
		if(result) {
			System.out.println("대여 성공");
		} else {
			 System.out.println("대여 실패");
		}
	}
}
