//Write a java program to separate zeros from non-zeros in an integer array?

import java.util.Arrays;

public class Array7 {

    static void moveNonZero(int[] inArray){

        System.out.println("Inout array : "+Arrays.toString(inArray));

        int counter=0;

        for (int i=0;i<inArray.length;i++){

            if (inArray[i] != 0){
                inArray[counter]=inArray[i];
                counter++;

            }
        }

        while (counter<inArray.length){

            inArray[counter]=0;
            counter++;

        }

        System.out.println("After moving zeros to end:");
        System.out.println(Arrays.toString(inArray));

    }

    public static void main(String[] args) {
        moveNonZero(new int[] {12,0,0,0,4,5,6,0,0});
    }
}
