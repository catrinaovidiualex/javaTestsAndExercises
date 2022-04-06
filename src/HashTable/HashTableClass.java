package HashTable;
import java.util.*;

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

        //show the value of key = 102 from hash table
        System.out.println(ht.get(102));

        // show the numbers of elemnts from HashTable
        System.out.println(ht.size());

        // add more elements into hash table
        ht.put(200,"Alex");
        ht.put(203,"Mihai Florin");
        System.out.println(ht);

        Hashtable companies = new Hashtable();

        companies.put("Google", "United States");
        companies.put("Nokia", "Finland");
        companies.put("Sony", "Japan");

        // Java Hashtable example to get Object from Hashtable
        // get(key) method is used to retrieve Objects from Hashtable
        companies.get("Google");

        System.out.println(companies);

        // Hashtable containsKey Example
// Use containsKey(Object) method to check if an Object exits as key in
// hashtable
        System.out.println("Does hashtable contains Google as key: "
                + companies.containsKey("Google"));


// Hashtable containsValue Example
// just like containsKey(), containsValue returns true if hashtable
// contains specified object as value
        System.out.println("Does hashtable contains Japan as value: "
                + companies.containsValue("Japan"));


// Hashtable enumeration Example
// hashtabl.elements() return enumeration of all hashtable values
        Enumeration enumeration = companies.elements();

        while (enumeration.hasMoreElements()) {
            System.out
                    .println("hashtable values: " + enumeration.nextElement());
        }


// How to check if Hashtable is empty in Java
// use isEmpty method of hashtable to check emptiness of hashtable in
// Java
        System.out.println("Is companies hashtable empty: "
                + companies.isEmpty());


// How to find size of Hashtable in Java
// use hashtable.size() method to find size of hashtable in Java
        System.out.println("Size of hashtable in Java: " + companies.size());


// How to get all values form hashtable in Java
// you can use keySet() method to get a Set of all the keys of hashtable
// in Java
        Set hashtableKeys = companies.keySet();


// you can also get enumeration of all keys by using method keys()
        Enumeration hashtableKeysEnum = companies.keys();


// How to get all keys from hashtable in Java
// There are two ways to get all values from hash table first by using
// Enumeration and second getting values ad Collection

        Enumeration hashtableValuesEnum = companies.elements();


        Collection hashtableValues = companies.values();


// Hashtable clear example
// by using clear() we can reuse an existing hashtable, it clears all
// mappings.
        companies.clear();

    }


}
