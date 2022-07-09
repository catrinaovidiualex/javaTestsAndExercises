package HashMap;

import java.util.HashMap;

public class HashMapClass {
    public static <HaspMap> void main(String[] args) {
       int a=10;
        int b=3;
        int c=88;


        HashMap <String,Integer> hp= new HashMap<String,Integer>();
        //HashMap.put(key,value);
        hp.put("a",10);
        hp.put("b",3);
        hp.put("c",88);
        System.out.println(hp);
        //return value of "c" key

        System.out.println(hp.get("c"));

        // Create a HasHMap for  sorting user and password

        HashMap<String,String> userInfo= new HashMap<String,String>();
        userInfo.put("AlexOvidiu","ocatrina.2022");
        userInfo.put("DanIonut","dion-2021");
        userInfo.put("MariaElena","elena-m1989");
        userInfo.put("DanaAlina","adana.1983");
        userInfo.put("test","test-2022");

        System.out.println(userInfo);

        //remove an element from HashMap

        userInfo.remove("test");

        System.out.println(userInfo);

        //check if a hashmap contains a specific value
        System.out.println(userInfo.containsValue("dion-2021"));

        //check if a hashmap contains a specific key
        System.out.println(userInfo.containsKey("DanaAlina"));

        // replace old value with new value
        // it will return {MariaElena=b3tterPassw0rd, DanaAlina=adana.1983, AlexOvidiu=ocatrina.2022, DanIonut=dion-2021}
        System.out.println(userInfo.replace("MariaElena","b3tterPassw0rd"));

        System.out.println(userInfo);

        // show all the values from hashmap
        System.out.println(userInfo.values());

        // clear hash map
       hp.clear();
       System.out.println(hp);

    }
}
