//Write a java program to count occurrences of each element in an array

import java.util.Arrays;
import java.util.HashMap;

public class Array11 {

    static void countelement(int inputArray[]){

        HashMap<Integer,Integer> counts=new HashMap<Integer, Integer>();

        for (int i:inputArray){

            if (counts.containsKey(i)){

                counts.put(i,counts.get(i)+1);
            }
            else {

                counts.put(i,1);
            }
        }

        System.out.println("Input Array: "+Arrays.toString(inputArray));
        System.out.println("Element counts: "+counts);

    }

    public static void main(String[] args) {

        countelement(new int[]{ 4, 5, 4, 5, 4, 6});
    }
}
