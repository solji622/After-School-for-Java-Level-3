package librarys;

public class Library {
	public static Book FindBook(String option) {
		if (option.equals("fiction")) {
			return new FictionBook();
		} else if (option.equals("nonfiction")) {
			return new NonFictionBook();
		} else if (option.equals("magazine")) {
			return new Magazine();
		} else {
			return new DefaultBook();
		}
	}
}
