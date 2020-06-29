package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveMethods {

    public static void main(String[] args) {
        ArrayList<Integer> list = testList();
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        
        list.remove(new Integer(0));
        System.out.println(list);
    }

    public static ArrayList<Integer> testList() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=10;i>=0;i--) {
            list.add(i);
        }
        return list;
    }

}
