package nullLabel.after;

public class Person {
	private Label name;
	private Label mail;
	
	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public Person(Label name) {
		this(name, new NullLabel());
		// mail을 적지 않을 경우 null로 처리
	}
	
	public void display() {
		name.display();
		mail.display();
	}
	
	@Override
	public String toString() {
		String result = "[person : name = " + name + ", mail = " + mail + "]";
		return result;
	}
}
