package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List <String> myList= new ArrayList<>();
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");
        myList.add("Object 4");

        System.out.println(myList);

        myList.remove(1);
        myList.remove("Object 1");
        System.out.println("myList after deletion:"+myList);
        int size = myList.size();
        System.out.println("Size of myList is:"+size);
        Iterator it= myList.iterator();

        while(it.hasNext()){
            Object next=it.next();

        }

        for (int i=0;i< myList.size();i++){
            System.out.println(myList.get(i));
        }

       //how to clear a list?

        myList.clear();
        System.out.println("Your list was cleared!");
        System.out.println(myList);
    }
}
