//Write a java program to find all the leaders in an integer array?

import java.util.Arrays;

public class Array8 {

    static void findLeader(int[] inputArray){

        int arrayLength=inputArray.length;
        int max=inputArray[arrayLength-1];

        System.out.println("Leader of the array "+Arrays.toString(inputArray)+" are: ");

        System.out.println(inputArray[arrayLength-1]);

        for (int i=arrayLength-2;i>= 0;i--){

            if (inputArray[i]>max)
            {

                System.out.println(inputArray[i]);
                max=inputArray[i];
            }

        }

        System.out.println("-----");
    }

    public static void main(String[] args) {

        findLeader(new int[] {12, 9, 7, 14, 8, 6, 3});
    }
}
