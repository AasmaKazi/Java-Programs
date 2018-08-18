import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {

    public static void main(String[] args) {

        int number,record;
        String name;

        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map1=new HashMap<Integer, String>();

        System.out.println("Hash map Example....");
        System.out.println("Enter number of records: ");
        record=sc.nextInt();
        for (int i=0;i<record;i++) {



        System.out.println("Enter number: ");
        number=sc.nextInt();

        System.out.println("Enter name: ");
        name=sc.next();


            map1.put(number, name);

        }

        System.out.println("Values in map: "+map1);


    }

}
