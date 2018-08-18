import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkList {

    public static void main(String[] args) {

        Map<Integer,String> map=new LinkedHashMap<>();

        System.out.println("Map implementation");
        map.put(200,"OK");
        map.put(303,"See other");
        map.put(404,"Not found");
        map.put(500,"Internal sever error");

        System.out.println(map);


        System.out.println("get method of map");
        String status=map.get(500);
        System.out.println(status);

//        System.out.println("Contains Key method");
        if (map.containsKey(303))
            {
                System.out.println("Key found");
            }

            //Contains value
        if (map.containsValue("Not found"))
        {
            System.out.println("value found message found");
        }
        else {

            System.out.println("value not found ");
        }

        //removing map
        String removeVal=map.remove(200);
        if (removeVal != null){

            System.out.println("This value is removed from map: "+ removeVal);
        }

// Replace

        System.out.println("Befor replace :"+map);

       map.replace(303,"Other error");

        System.out.println("After replacing :"+map);

        //size of map

        int size=map.size();
        System.out.println(size);

        //map is empty or not

        if (map.isEmpty()){
            System.out.println("Map is empty");
        }
        else {
            System.out.println("Not empty");
        }

    }
}
