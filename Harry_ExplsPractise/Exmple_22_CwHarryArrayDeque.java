package with_harry_exmples;

import java.util.ArrayDeque;

public class Exmple_22_CwHarryArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> arr  = new ArrayDeque<>();

        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.offerFirst(16);
        arr.addFirst(15);
        arr.addLast(17);
        arr.offerLast(18);


        System.out.println(arr);
        System.out.println(arr.getFirst());
        System.out.println(arr.peekFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.peekLast());

        arr.pollFirst();
        arr.removeFirst();
        arr.pollLast();
        arr.removeLast();

        System.out.println(arr);

    }
}
