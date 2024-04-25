package hash;

import java.util.HashMap;

public class hashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("ABC", 10);
		hashMap.put("BBB", 20);
		hashMap.put("AAA", 30);
		hashMap.put("ABC", 15); // 기존 10 대신 15가 덮어씌워짐
		
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.get("ABC"));
		System.out.println(hashMap.containsKey("ABC"));
		
		
		hashMap.remove("ABC");
		System.out.println(hashMap.containsKey("ABC"));
		System.out.println(hashMap.size()); // abc가 덮어씌워졌기에 원래 3였으나 abc 지웠으니 2
		
		hashMap.clear();
		System.out.println(hashMap.isEmpty());

	}
}
