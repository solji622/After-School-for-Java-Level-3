package poly.basic;

public class PolyMain {
	public static void main(String[] args) {
		
		// 부모 변수가 부모 인스턴스 참조
		// 생성자 생성 - p 만 생성
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		// 자식 변수가 자식 인스턴스 참조 
		// -> 부모 상속받았기에 부모 메서드도 호출 가능
		// 생성자 생성 - p 아래 c 생성(상속 받았기에)
		System.out.println("Child -> Child");
		Child child = new Child();
		child.childMethod();
		child.parentMethod();
		
		// 부모 변수가 자식 인스턴스 참조 (다형적 참조) -> 부모는 자식을 품을 수 있다
		// 생성자 생성 - p와 c가 생성되긴 함
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		
		poly.parentMethod();
		
//		poly.childMethod(); 자식의 기능 호출 불가능
//		Child poly2 = new Parent(); 자식은 부모를 담을 수 없다(참조 불가능)
	}
}

/*
 1. 객체지형 프로그래밍의 대표적인 특성: 캡슐화, 상속, 다형성 ...
 2. 다형성은 객체지향 프로그래밍의 꽃이라 불린다
 3. 다형성은 이름 그대로 '다양한 형태', '여러 형태'를 뜻한다
 4. 프로그래밍에서 다형성은 한 객체가 여러 타입의 객체로 취급할 수 있는 능력을 뜻한다
 5. 보통 하나의 객체는 하나의 타입으로 고정되어 있는데 다형성을 사용하면 하나의 객체가 다른 타입으로 사용될 수 있다는 뜻이다.
 
 다형성 2가지 핵심 이론
 1. 다형적 참조
 2. 메서드 오버라이딩
 */
