package ArrayList;

import java.util.ArrayList;

public class OperationsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add element   O(1)
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);

        //get element   O(1)
        System.out.println(list.get(1));

        //remove element  O(n)
        list.remove(3);
        System.out.println(list);

        //set element at index  O(n)
        list.set(2,15);
        System.out.println(list);

        //contains element  O(n)
        System.out.println(list.contains(11));
        System.out.println(list.contains(12));

        //size of arraylist
        System.out.println(list.size());
    }
}
