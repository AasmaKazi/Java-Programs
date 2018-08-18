import java.util.HashSet;

public class Array1 {

    //finding duplicate elements in aaray

    public static void main(String[] args) {

        String[] strArray={"monday","tuesday","wednesday","sunday","monday","sunday"};

        //Simple implemantation

//        for (int i=0;i<strArray.length-1;i++){
//
//            for (int j=i+1;j<strArray.length;j++){
//
//                if (strArray[i].equals(strArray[j]) && (i != j)){
//
//                    System.out.println("found duplicate element: "+strArray[j]);
//                }
//            }
//        }


        //using hash set

       HashSet<String> strArr=new HashSet<>();
       for (String setArr:strArray){

           if (!strArr.add(setArr)){

               System.out.println("found duplicate: "+setArr);
           }
       }

    }
}
