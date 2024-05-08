package construct;

public class Book {
	String title;
	String author;
	int page;
	
	Book(){
		this("","",0);
	};
	
	Book(String title, String author){
		this(title, author, 0);
	}
	
	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public void displayinfo(){
		System.out.println("제목: " + title + " 저자: " + author + " 페이지: " + page);
	}


}

package construct;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayinfo();
		
		Book book2 = new Book("Hello Java", "Seo");
		book2.displayinfo();
		
		Book book3 = new Book("JPA 프로그래밍", "kim", 700);
		book3.displayinfo();
	}
}
