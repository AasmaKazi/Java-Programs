//Write a java program to reverse an array without using an additional array

import java.util.Arrays;

public class Array12 {

    static void reverseArray(int inputArray[]){

        System.out.println("Array befor revesr:"+ Arrays.toString(inputArray));
        int temp;

        for (int i = 0;i<inputArray.length/2;i++){

            temp=inputArray[i];
            inputArray[i]=inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i]=temp;

        }

        System.out.println("Array after reverse opration: "+Arrays.toString(inputArray));

        System.out.println("---");
    }

    public static void main(String[] args) {
        reverseArray(new int[] {21,34,22,16,76,87});
    }

}
