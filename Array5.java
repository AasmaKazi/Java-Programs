//5) Write a java program to find continuous sub array whose sum is equal to a given number?
//some error
//https://javaconceptoftheday.com/java-array-interview-programs/
import java.util.Arrays;

public class Array5 {

    static void subArray(int[] inputArray, int inputNum) {


        int sum = inputArray[0];
        int start = 0;

        for (int i = 1; i < inputArray.length; i++) {

            sum = sum - inputArray[start];
            start++;


        if (sum == inputNum) {

            System.out.println("Input Array: " + Arrays.toString(inputArray));
            System.out.println("Input Number: " + inputNum);
            System.out.println("continuous sub array: ");

            for (int j = start; j <= i; j++) {

                System.out.println(inputArray[j] + " ");
            }
            System.out.println();

        }

    }

        System.out.println("--------------");
}

    public static void main(String[] args) {

        subArray(new int[]{10,4,11,22,21},26);
    }
}
