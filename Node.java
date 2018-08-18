import java.util.Scanner;
//need correction
public class Node<T extends Comparable<T>> {

    Node<T> left;
    Node<T> right;
    T data;

    public Node(T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public void insert(T value){

        if (value.compareTo(data)<=0){

            if (left == null){
                left=new Node<T>(value);
            }

            else {

                left.insert(value);
            }
        }

        else {

            if (right==null){

                right=new Node<T>(value);
            }

            else {

                right.insert(value);
            }
        }
    }

    public boolean contains(T value){
        if (value.compareTo(data)==0){

            return true;
        }

        else if (value.compareTo(data)< 0){
            return (left == null)? false: left.contains(value);
        }

        else {

            return (right == null)? false: right.contains(value);
        }
    }

    public void inOrder(){

        if (left !=null){

            left.inOrder();
        }

        System.out.println(data + " ");

        if (right !=null){

            right.inOrder();
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        Node<Integer> root=new Node<Integer>(sc.nextInt());
        while (sc.hasNextInt()){

            int value=sc.nextInt();
            root.insert(value);
        }

        sc.close();
        root.inOrder();
    }
}
