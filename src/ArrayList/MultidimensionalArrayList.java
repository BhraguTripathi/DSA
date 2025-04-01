package ArrayList;

import java.util.ArrayList;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10); list1.add(56);
        mainList.add(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(85); list2.add(96);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i=0;i< mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j< currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
