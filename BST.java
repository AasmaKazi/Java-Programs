import java.util.Scanner;

public class BST {

    public static void main(String[] args) {
        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements:");

        num=sc.nextInt();

        int array[]=new int[num];

        System.out.println("Enter values:");

        for (int counter=0;counter<num;counter++){

            array[counter]=sc.nextInt();
        }

        System.out.println("Enter number to be search");
        int searchNum=sc.nextInt();

        int first=0;
        int last=num-1;
        int middle =(first+last)/2;

        while (first <= last){

            if (array[middle] < searchNum){

                first = middle+1;
            }
                else if (array[middle] == searchNum){
                System.out.println(searchNum+ " found at Location "+(middle+1)+" : ");
                break;
            }

            else {

                last = middle-1;

            }

            middle=(first+last)/2;

        }

        if (first>last){

            System.out.println(searchNum +" not found");
        }
    }
}
