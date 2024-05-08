package extends1.super2;

public class ClassC extends ClassB{
	/*
	 classB에 기본 생성자가 없기에 그냥 상속하였을 때 에러가 뜸
	 무조건 생성자를 만들어서 호출해주어야 함
	 */
	
	public ClassC() {
		super(10, 20);
		System.out.println("ClassC 생성자");
	}
	
	
	
	
}
