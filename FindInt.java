package removecontrolflag.after;

public class FindInt {
	public static boolean find(int[] data, int number) {
		boolean found = false;
		
		for (int i = 0; i<data.length; i++) {
			if (data[i] == number) {
				found = true;
				return found;
//				break 보다는 return을 바로 해주는 것이 좋음
			}
		}
		
		return found;
	}
}

/*
 리팩토링 해야되는 이유
 의미가 불분명한 것을 변수명으로 사용했다
 -> 명확한 이름으로 해주는 것이 좋음
 return 받을 때까지 반복문이 반복된다
 -> 조건에 충족하면 바로 return하게 만든다
*/