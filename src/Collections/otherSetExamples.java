package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class otherSetExamples {
    public static void main(String[] args) {
        Set<String> mySet= new HashSet<>();
        mySet.add("Test");
        mySet.add("Test");
        mySet.add("Test2");
        mySet.add("Test1");
        System.out.println(mySet);

        Iterator it = mySet.iterator();
        while(it.hasNext())   {
            Object el = it.next();
            System.out.println(el);
        }

        //TreeSet displys elements in asc order

        Set<String> myTreeSet= new HashSet<>();
        myTreeSet.add("11");
        myTreeSet.add("2test");
        myTreeSet.add("28Mins");
        myTreeSet.add("2");
        System.out.println(myTreeSet);

        //remove element

        mySet.remove("Test1");
        System.out.println("Set after removing elements:"+mySet);







    }

}
