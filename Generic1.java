import java.util.ArrayList;
import java.util.List;
//Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
public class Generic1 {

    public static void main(String[] args) {

        int count=0;

        List<String> list=new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("Elements in list:"+list);

        for (String element:list){

          count++;
        }
        System.out.println("Size of list"+list.size()+" Count no. of element: "+count);
    }
}


