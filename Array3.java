//Write a java program to check the equality of two arrays?

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {

        int[] array1={12,32,34,21,31};
        int[] array2={11,9,5,44,37,90,87};

        boolean equalOrNot= true;

        if (array1 == array2 ){

            for (int i=0;i<array1.length;i++){

                if (array1[i] != array2[i]){

                    equalOrNot=false;
                }
            }
        }

        else {
            equalOrNot=false;
        }

        System.out.println("Input Array:");
        System.out.println("1st array: "+Arrays.toString(array1));
        System.out.println("2nd array: "+Arrays.toString(array2));
        if (equalOrNot){
            System.out.println("arrays are equal !!!!");

        }
        else {
            System.out.println("Arrays are not equal.....");
        }
    }
}
