package poly.basic;

public class CastingMain4 {
	public static void main(String[] args) {
		// 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다!!
		Parent parent1 = new Child();
		Child child1 = (Child)parent1;
		child1.childMethod();
		
		Parent parent2 = new Parent();
		Child child2 = (Child)parent2;
		child2.childMethod(); // 런타임 오류
		// 오류나는 이유! -> 문법상으로는 문제가 없지만
		// 메모리 상으로는 Child가 없기에 실행이 안 됨
		// 자식을 참조하였을 때만 다운캐스팅 가능
	}
}
