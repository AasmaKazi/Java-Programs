import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();

        if(n<=0){

            System.out.println("-ve no. is entered.....");
        }
        else {

            int sum=0;

            while (n!=0){
                sum+=n%10;

                n=n/10;


            }

            System.out.println("sum:"+sum);
        }
    }
}
