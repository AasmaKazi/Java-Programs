//Write a java program to find the most frequent element in an array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array15 {

    static void getCount(int inputArray[]){


        HashMap<Integer,Integer>  map=new HashMap<Integer, Integer>();

        for (int i:inputArray){

            if (map.containsKey(i)){

                map.put(i,map.get(i)+1);
            }
            else {

                map.put(i,1);
            }
        }

        int element=0;
        int frequency=1;

        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();

        for (Map.Entry<Integer,Integer> entr:entrySet){

            if (entr.getValue() > frequency){

                element=entr.getKey();
                frequency=entr.getValue();
            }

        }

        if (frequency > 1){

            System.out.println("Inout Array: "+Arrays.toString(inputArray));
            System.out.println("Most frequent element: "+element);
            System.out.println("Frequency is: "+frequency);

        }

        else {

            System.out.println("Input Array "+Arrays.toString(inputArray));
            System.out.println("No frequent element found...");


        }

    }


    public static void main(String[] args) {
        getCount(new int[] {1,4,2,6,7,4,8,4});
    }
}
