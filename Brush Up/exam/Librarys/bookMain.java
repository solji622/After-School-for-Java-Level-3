package librarys;

public class bookMain {
	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService();
		
		String book1 = "fiction";
		int days1 = 3;
		libraryService.proccessBorrow(book1, days1);
		
		String book2 = "yeah";
		int days2 = 7;
		libraryService.proccessBorrow(book2, days2);
	}
}
