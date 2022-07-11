package Collections;

import java.util.*;

public class otherEx {

    public static void main(String[] args) {
        LinkedList llist= new LinkedList();
        llist.add("Rob");
        llist.add("Alex");
        llist.add("Jhon");

        System.out.println("First elem from linkedlist"+llist.getFirst());



        ArrayList <Integer> al = new ArrayList <Integer>();

        al.add(1002);
        al.add(632);
        al.add(1);
        al.add(42);
        al.add(552);
        al.add(963);

        System.out.println("Array is:"+al);

        Iterator itt =al.iterator();
        while (itt.hasNext()) {
           if ((int) itt.next()==632){
               System.out.println("it appears in the list");
           }else{
               System.out.println("not found");
           }
        }

        // how to sort Array elements

        Arrays.sort(al);



        }
    }


