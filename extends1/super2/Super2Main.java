package extends1.super2;

public class Super2Main {
	public static void main(String[] args) {
		ClassC classc = new ClassC();
		ClassB classv = new ClassB(5);
		
	}
}

/*
 1. 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다.
 	따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터 초기화
 2. 상속 관계에서 자식 클래스의 생성자 첫 줄에 반드시 super(...)를 호출해야한다.
 	단 기본 생성자 (super())인 경우 생략 가능
 
 클래스와 메서드에 사용되는 final
 1. 클래스에 final -> 상속 더이상 못함, 확장 불가능, 타 클래스가 final로 선언한 클래스를 상속받을 수 없다.
 	public final class My{....}
 2. 메서드에 final -> 오버라이딩 더이상 못함, 오버라이드 불가능, 상속받은 서브 클래스에서 메서드 변경 가능
 	public final void My{...}
 
 
 
 */
