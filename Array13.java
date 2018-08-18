import java.util.Arrays;

public class Array13 {

    static void deleteDuplicate(int inputarray[]){

        System.out.println("Array with duplicates: "+ Arrays.toString(inputarray));

        int noOfUniqye=inputarray.length;
        for (int i=0;i<noOfUniqye;i++){

            for (int j=i+1;j<noOfUniqye;j++){

                if (inputarray[i]==inputarray[j]){

                    inputarray[j]=inputarray[noOfUniqye-1];

                    noOfUniqye--;
                    j--;

                }
            }
        }

        int[] arrayWithouthDuplicate=Arrays.copyOf(inputarray,noOfUniqye);

        System.out.println("After deleting dulicates: "+Arrays.toString(arrayWithouthDuplicate));
    }

    public static void main(String[] args) {

        deleteDuplicate(new int[] {2,3,5,2,4,6,3,5});


    }
}
