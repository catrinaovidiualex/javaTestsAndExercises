package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        //HashSet class implement Set interface
        /*Set<String> mySet=new HashSet<>();

        mySet.add("Hello");
        mySet.add("this");
        mySet.add("is");
        mySet.add("a");
        mySet.add("set example!");

        System.out.println("My set elements are:"+mySet);*/

        Set<String> set2=Set.of("Hello","example of set","this is another","world");

        /*Iterator<String> it= set2.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("iterate Set using for each:");
        for (String element: set2){
            System.out.println(element);
        }*/


        // Tree set
        Set<String> myTreeSet= new TreeSet<>();

        myTreeSet.add("a");
        myTreeSet.add("Hello");
        myTreeSet.add("set example!");
        myTreeSet.add("this");
        myTreeSet.add("is");
        myTreeSet.add("11");
        myTreeSet.add("2");
        myTreeSet.add("31");
        myTreeSet.add("-81");
        myTreeSet.add("2");


       // iterate TreeSet using iterator
        System.out.println("iterate TreeSet using iterator:");
        Iterator<String> it3= myTreeSet.iterator();
        while(it3.hasNext()){
            String next = it3.next();
            System.out.println(next);
        }

        // iterate TreeSet using for each

        System.out.println("iterate TreeSet using for each:");
        for (String element: myTreeSet){
            System.out.println(element);
        }


       boolean removed1= myTreeSet.remove("Hello");
        System.out.println("After deletion of an element:"+myTreeSet);
        System.out.println("removed element was:"+ removed1);
        System.out.println("Length of the set is:" +myTreeSet.size());

        boolean containsElement= myTreeSet.contains("set example!");
        System.out.println(containsElement);





    }


}
