package poly.basic;

public class CastingMain5 {
	public static void main(String[] args) {
		// 다운 캐스팅 불가능
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		// 다운 캐스팅 가능
		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}
	
	
	// 다운 캐스팅 여부 확인
	private static void call(Parent parent) {
		parent.parentMethod();
		
		if(parent instanceof Child) {
			// instanceof 참조 되었나요?
			System.out.println("Child 인스턴스 맞음");
			((Child)parent).childMethod();
		}
	}
}

/*
 지금처럼 다운 캐스팅을 수행하기 전에 먼저 instanceof를 사용해서 원하는 타입으로
 변환이 가능한지 확인한 다음에 다운캐스팅을 수행하는 것이 안전하다
 
 참고로 instanceof 키워드는 오른쪽 대상의 자식 타입을
 왼쪽에 참조하는 경우에도 true를 반환한다
 
 ex) parent instanceof Parent - true
 new Parent() instanceof Parent - true
 new Child() instanceof Parent - true
 
  [예제]
  new Parent() instanceof Parent -> true
  => Parent p = new Parent()
  
  new Child() instacneof Parent -> true
  => Parent p = new Child()
  
  new Parent() instacneof Child -> false
  => Child c = new Parent()
  
 */
