package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {

	public static void main(String[] args) {
    // 배열의 원소를 더한 값이 target과 같으면 true를 출력하는 메소드 생성하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int N = sc.nextInt();
		System.out.print("target: ");
		int target = sc.nextInt();
		int [] arr = new int[N];
		
		for (int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr, target));

	}
	
	
	// solution 메소드 생성 및 구현
	
	// 1. Hashset 사용 없이
	public static boolean solution(int arr[], int target) {
		boolean result = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					result = true;
				} else {
					result = false;
				}
			}
			
		}
		return result;
	}
	
	// 2. Hashset 사용
	public static boolean solution2 (int[] arr, int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i : arr) {
			if (set.contains(target-i)) {
				return true;
			}
			set.add(i);
		}
		
		return false;
	}
	
}
