import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {

        int temp;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of elements");
        int num=sc.nextInt();

        int array[] =new int[num];

        System.out.println("Enter elements:");
        for (int i=0;i<num;i++){

            array[i]=sc.nextInt();
        }

        for (int i=0;i<num - 1;i++){

            for (int j=0;j<num -i -1;j++){

                if (array[j]>array[j+1]){

                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i=0;i<num;i++){
            System.out.println(array[i]);
        }
    }
}
