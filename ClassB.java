package extends1.super2;

public class ClassB extends ClassA{
	public ClassB(int a) {
		this(a, 0);
		// super() 사용하면 안 됨, super는 한번만 사용함
	}
	
	
	public ClassB(int a, int b) {
		super(); // super 생략
		System.out.println("ClassB 생성자 a=" + a + " b="+b);
	}
	
	
}
