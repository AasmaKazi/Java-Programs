//2) Write a java program to find second largest element in an array of integers?


import java.util.Arrays;

public class Array2 {

    static void secLargNum(int[] input){

        int firstLarg,secLarg;

        if (input[0] > input[1]){
            //if 1st is > than 2nd

            firstLarg=input[0];
            secLarg=input[1];
        }
        else {

            // 2nd > 1st
            firstLarg=input[1];
            secLarg=input[0];
        }

        for (int i=2;i<input.length;i++){


            if (input[i]>firstLarg){

                secLarg = firstLarg;
                firstLarg=input[i];

            }
            else if (input[i]<firstLarg && input[i] >secLarg){
                secLarg=input[i];
            }
        }

        System.out.println("Input array: ");
        System.out.println(Arrays.toString(input));
        System.out.println("second largest num:");
        System.out.println(secLarg);
    }

    public static void main(String[] args) {
        secLargNum(new int[] {234,123,43,567,678});

    }

}
