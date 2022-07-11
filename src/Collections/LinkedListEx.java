package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {


        // create an empty LinkedList

        LinkedList<String> newList = new LinkedList<String>();
        LinkedList<String> newList2= new LinkedList<String>();

        //append or add elements in the list

        newList.add(0, "Red");
        newList.add("Blue");
        newList.add(2,"Yellow");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");

        newList2.add("VW Pasat");
        newList2.add("Cielo");
        newList2.add("Renault Megan");

        System.out.println(newList);
        System.out.println(newList2);

        // iterate through all elements in a linked list

        System.out.println("Elements of the linkedList are:");
        for(String el:newList){
            System.out.println(el);
        }

        for(String elem: newList2){
            System.out.println(elem);
        }

        // iterate all elements in a linked list but in reverse order
        // The descendingIterator() method of java.util.LinkedList class is used to return an iterator over the elements in this LinkedList in reverse sequential order.
        // The elements will be returned in order from last (tail) to first (head).
        System.out.println("Elements of the linkedList in reverse order:");
        Iterator it = newList.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // insert an element on a specified position in linked list;
        newList.add(3,"testColor");
        System.out.println("List's elements after inserting new item:");
        System.out.println(newList);

        //insert new elements at the first and last position;
        newList.add(0,"firstColor");
        int lastPosition=newList.size();
        newList.add(lastPosition,"lastColor");

        System.out.println("List's elements after inserting new items:");
        System.out.println(newList);

        // varianta 2

        newList.addFirst("testFirstColor");
        newList.addLast("testLastColor");
        System.out.println("List's elements after inserting new items:");
        System.out.println(newList);

        newList2.addFirst("First car");
        newList2.addLast("Last car from the list");

        System.out.println(newList2);

        // get the first and last occurrence of the specified elements in a linked list
        String firstElement=newList.getFirst();
        String lastElement=newList.getLast();
        System.out.println("First element from the list:"+firstElement);
        System.out.println("Last element from the list:"+lastElement);

        //remove a specified element from a linked list
        newList.remove("Green");
        System.out.println("List after deletion of the element:"+newList);

        newList2. remove("Cielo");
        System.out.println("List after deletion of car:"+newList2);

        // delete first and last elements from the list;
        String deleteFirst=newList.removeFirst();
        String deleteLast=newList.removeLast();
        System.out.println("List's elements after deletion of first and last element:"+newList);

        //remove all the elements from the list
        newList.clear();
        System.out.println("List is cleared:"+newList);

        //join two linked list

        LinkedList <String> c1 = new LinkedList <String> ();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);

        // Let join above two list
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);

        // clone a linked list

        System.out.println("Original linked list is:"+c1);
        LinkedList <String> c1Clone= new LinkedList<String>();
        c1Clone=(LinkedList) c1.clone();
        System.out.println("Clone of c1 is:"+c1Clone);

        // convert a linked list into array list
        List<String> myArrayList = new ArrayList<String>();

        for (String str:myArrayList){
            System.out.println(str);
        }

        // check if a linked list is empty
        if(c1.isEmpty()){
            System.out.println("Linked List is empty");
        } else{
            System.out.println("Linked List is not empty");
        }

    }

}
