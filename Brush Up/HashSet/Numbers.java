package HashSet;

import java.util.HashSet;

public class Numbers {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

       set.add(1);
       set.add(2);
       set.add(3);
       set.add(4);
       set.add(4);
       set.add(5);

        System.out.println("크기 : " + set.size());

        System.out.println("3 유무 : " + set.contains(3));

        set.remove(4);

        System.out.println("모든 요소 : " + set);

    }
}
