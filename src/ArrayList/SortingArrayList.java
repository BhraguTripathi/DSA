package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);  //ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());  //descending order
        System.out.println(list);
    }
}
