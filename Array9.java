// Write a java program to find a missing number in an integer array?

import java.util.Arrays;

public class Array9 {

    static int sumOfNnumber(int number){

        int sum=(number*(number+1)/2);
        return sum;
    }

    static int sumOfElements(int[] array1){

        int sumE=0;
        for (int i=0;i<array1.length;i++){

            sumE=sumE+array1[i];
        }

        return sumE;
    }

    public static void main(String[] args) {

        int number = 8;
        int[] array={1, 4, 5, 3, 2, 8,6};
        int sumOfNnumber =sumOfNnumber(number);
        int sumOfElements=sumOfElements(array);

        int missingNum=sumOfNnumber-sumOfElements;

        System.out.println("Input Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Missing number: "+missingNum);
    }
}
