import java.util.*;

public class Mapping {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        System.out.println("Map implementation");
        map.put(200,"OK");
        map.put(303,"See other");
        map.put(404,"NOt found");
        map.put(500,"Internal sever error");

        System.out.println(map);


        //Iterator in map
//        Set<Integer> setMap=map.keySet();
//        Iterator itr=setMap.iterator();
//        while (itr.hasNext()){
//
//            int code = itr.next();
//            String err=map.get(code);
//            System.out.println(code+" "+err);
//
//        }


        //Iterator using values
        Collection<String> errors=map.values();

        for (String err:errors){

            System.out.println(err);
        }

//   Entery set

        Set<Map.Entry<Integer,String>> setEntry=map.entrySet();

        for (Map.Entry<Integer,String> enr: setEntry){

            int code = enr.getKey();
            String error =enr.getValue();

            System.out.println(code +" : "+error);
        }

    }
}
