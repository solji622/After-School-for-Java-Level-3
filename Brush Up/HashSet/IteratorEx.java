package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

        // HashSet의 순서대로 입력되지 않는 특성 때문에 순서가 뒤죽박죽으로 출력됨
    }
}
