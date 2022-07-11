package Collections;

//https://www.youtube.com/watch?v=d3QbptJRln4&list=PLL8woMHwr36HmQfxqqqxns5GexTNmxFqK&index=2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        List<String> copyOf_list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add(0,"Yellow");
        list_Strings.set(2,"White Smoke");

        // print the list using iterator
        System.out.println("List's elements using iterator:");
        Iterator it =  list_Strings.iterator();
        while(it.hasNext()){
          Object element=it.next();
            System.out.println(element);
        }


        // print the list using for loop
        System.out.println("List's elements:");
        for (int i=0;i<=list_Strings.size()-1;i++){

                System.out.println(list_Strings.get(i));
        }

        // using for each
        System.out.println("List's elements using for each:");
        for( String l: list_Strings){
            System.out.println(l);
        }

        // checking if an element is black
       for (int i=0;i<=list_Strings.size()-1;i++){
           if(list_Strings.get(i)=="Black"){
           System.out.println(list_Strings.get(i)+" having index of:"+i);}
       }


       //remove the 3rd element from the list
       list_Strings.remove(3);
        System.out.println("List without having the 3rd element"+list_Strings);


       // update the second element
        list_Strings.set(2,"Grey");

        System.out.println("List - after update the second element:");
        for(String el:list_Strings){

            System.out.println(el);
        }

        //sort an array of strings
        System.out.println("the array after sorting elements:");
        Collections.sort(list_Strings);

        // copy an array to another one

        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);

        // Copy List2 to List1

        Collections.copy(List1, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);

        //Write a Java program to reverse elements in a array list.
        System.out.println("List before reversing its elements:");
        System.out.println(list_Strings);

        System.out.println("List after reversing its elements:");
        Collections.reverse(list_Strings);
        System.out.println(list_Strings);

        // Write a Java program to extract a portion of a array list.
        System.out.println("Original list: " + list_Strings);
        List<String> sub_List = list_Strings.subList(2, 5);
        System.out.println("List of elements between 2 & 5: " + sub_List);

        // checking if an array is empty if not delete its elements:

        System.out.println("Original array list: " + list_Strings);
        System.out.println("Checking the above array list is empty or not! "+copyOf_list_Strings.isEmpty());
        copyOf_list_Strings.removeAll(copyOf_list_Strings);
        System.out.println("Array list after remove all elements "+copyOf_list_Strings);

        // how to increase capacity of an array ?

        System.out.println("Original array list: " + list_Strings);
        ((ArrayList<String>) list_Strings).ensureCapacity(8);
        list_Strings.add("testColor1");
        list_Strings.add("testColor2");
        list_Strings.add("testColor2");
        System.out.println("New array list: " + list_Strings);
    }
}


