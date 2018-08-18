//Write a java program to find the intersection of two arrays

import java.util.Arrays;
import java.util.HashSet;

public class Array6 {

    public static void main(String[] args) {
        String[] inArray1={"one","two","three","four","five"};
        String[] inArray2={"six","eight","ten","nine","two"};

        HashSet<String> setA=new HashSet<String>();

        for (int i=0;i<inArray1.length;i++){

            for (int j=0;j<inArray2.length;j++){

                if (inArray1[i]==inArray2[j]){

                    setA.add(inArray1[i]);
                }
            }
        }


        System.out.println("first Array: "+Arrays.toString(inArray1));
        System.out.println("Second Array: "+Arrays.toString(inArray2));
        System.out.println("Comman factor in both array is:"+setA);
    }

}
