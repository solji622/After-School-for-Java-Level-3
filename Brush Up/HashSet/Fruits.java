package HashSet;

import java.util.HashSet;

public class Fruits {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        set.add("Date");

        System.out.println(set.size());

        System.out.println("망고 유무 : " + set.contains("Mango"));

        set.remove("Banana");

        System.out.println("모든 요소 : " + set);
        // 중복을 제거하기에 Apple이 두개 있어도 한 개만 출력됨
    }
}
