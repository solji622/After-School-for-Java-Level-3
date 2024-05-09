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
