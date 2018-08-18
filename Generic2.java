
import java.util.ArrayList;

import java.util.List;
//Write a generic method to exchange the positions of two different elements in an array.
public class Generic2 {

    public static void main(String[] args) {

        List<Number> list=new ArrayList<>();

        list.add(21);
        list.add(34);
        list.add(42);
        list.add(20);
        list.add(11);

        System.out.println("In List "+list);

     Integer[] arrList=list.toArray(new Integer[0]);

        System.out.println("In Array: "+arrList);

    }
}
