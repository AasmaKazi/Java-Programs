//4) Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?

import java.util.Arrays;

public class Array4 {

    static void sumOfPair(int[] inputArray, int inputNum){

        System.out.println("Input array "+Arrays.toString(inputArray));
        System.out.println("Input number :"+inputNum);
        System.out.println("pair of element in Array whose sum is: "+inputNum+" are:");

        for (int i=0;i<inputArray.length;i++){
            for (int j=i+1;j<inputArray.length;j++){


                if (inputArray[i]+inputArray[j] == inputNum){

                    System.out.println(inputArray[i]+" + "+ inputArray[j]+" = "+inputNum);
                }
            }
        }

        System.out.println("********************");

    }

    public static void main(String[] args) {
        sumOfPair(new int[]{12,43,56,32,56},44);
    }

}
