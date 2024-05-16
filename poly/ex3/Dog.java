package poly.ex3;

public class Dog extends Animal{
	@Override
	public void sound() {
		// 자동완성 시 super가 안 되는 이유는 바디가 없기 때문
		System.out.println("멍멍");
	}
}
