package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> myHashSet= new HashSet<String>();


        myHashSet.add("Green");
        myHashSet.add("Yellow");
        myHashSet.add("Blue");
        myHashSet.add("Red");
        myHashSet.add("Grey");
        myHashSet.add("Black");

        // how to iterate all elements from hashset

        Iterator it = myHashSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // clone a hashset to another one

        HashSet newHashSet= new HashSet<>();
        newHashSet=(HashSet) myHashSet.clone();
        System.out.println("Cloned hashset is:"+myHashSet);

        //compare two hashsets

        for(String element: myHashSet){
            if(newHashSet.contains(element)==false){
                System.out.println("Are not the same");}
        }
        System.out.println("Are the same");
    }
}

