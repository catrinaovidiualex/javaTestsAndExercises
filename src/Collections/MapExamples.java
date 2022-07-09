package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        //Instaces of Map interface are: HashMap, TreeMap classes;
        Map<String, Customer> map = new HashMap<>();
        Customer customer1= new Customer(123,"Diana Anderson");
        Customer customer2 = new Customer(546,"John Anderson");
        Customer customer3 = new Customer(893,"Alex Ovidiu");

        // add elements in the map: map.put(key,value);
        map.put("xxx",customer1);
        map.put("yyy",customer2);
        map.put("333",customer3);
        //it will return:
        //{333=Customer{customerID=893, name='Alex Ovidiu'}, yyy=Customer{customerID=546, name='John Anderson'}, xxx=Customer{customerID=123, name='Diana Anderson'}}
        System.out.println(map);

        System.out.println(map.size());

         // check if this map contains key "yyy"
        System.out.println(map.containsKey("yyy"));

        //check if this map contains value of "John Anderson"
        System.out.println(map.containsValue("John Anderson"));

        //remove a key from the map
        map.remove("333");

        //it returns the value  for key "xxx"
        System.out.println(map.get("xxx"));
    }


}
