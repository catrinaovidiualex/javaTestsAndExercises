package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {
    public static void main(String[] args) {
        //HashTables contains (key, value);
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, "Ajay");
        ht.put(102, "Vijay");
        ht.put(103, "Ravi");
        ht.put(104, "Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
