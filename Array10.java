//Write a java program to convert an array to ArrayList and an ArrayList to array

import java.util.ArrayList;
import java.util.Arrays;

public class Array10 {

    public static void main(String[] args) {

        //Array to arraylist
        String[] array=new String[] {"one","two","three"};
        ArrayList<String> listArray=new ArrayList<String>(Arrays.asList(array));
        System.out.println("Converted to arrayList"+listArray);


        //ArrayList to Array
        System.out.println("\n From arrayList to simple array: \n");
        ArrayList<String> list=new ArrayList<String>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Friday");
        list.add("sunday");

        String[] toArray1=new String[list.size()];

        list.toArray(toArray1);
        for (String str : toArray1){
            System.out.println(str);
        }

    }
}
