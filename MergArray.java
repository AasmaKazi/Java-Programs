import java.util.Arrays;
import java.util.Scanner;

//Merge two arrays
public class MergArray {

    public static void main(String[] args){
        int size,size1,size2,i,k;

        int arr1[] = new int[50];
        int arr2[] = new int[50];
        int merge[]=new int[100];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array1: ");
        size1=sc.nextInt();

        System.out.println("Enter elements in arr1:");
        for (i=0;i<size1;i++){

            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter size of array2: ");
        size2=sc.nextInt();

        System.out.println("Enter elements in arr2:");
        for (i=0;i<size2;i++){

            arr2[i]=sc.nextInt();
        }


        System.out.println("Merging of array: ");
        for (i=0;i<size1;i++){

            merge[i] = arr1[i];
        }

        size=size1+size2;
        for(i=0, k=size1; k<size && i<size2; i++, k++)
        {
            merge[k] = arr2[i];
        }

        System.out.println("After merging the new array will be: ");
        for (i=0;i<size;i++){
            System.out.print(merge[i]+" ");
        }
    }


}
