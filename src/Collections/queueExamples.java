package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queueExamples {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        //Queue<Customer> queue = new ArrayDeque<>();
        //Queue<Customer> queue = new  priorityQueue<>();

        //add elements in queue
        queue.add( new Customer(1,"Alex Florin"));
        queue.add(new Customer(2,"Mihaela Ionela"));
        queue.add(new Customer(3,"Dan Gigi"));
        queue.add(new Customer(4,"Laurentiu Andrei"));

       //remove head of the queue
        queue.poll();

        //view head of the queue
        Customer headQ = queue.peek();
        System.out.println("head of queue is:"+ headQ);

        //number of elements store in the queue
        System.out.println(queue.size());

        // remove all elements from the queue
        queue.clear();
        System.out.println("Queue was cleared"+queue);

        // return all elements in the queue
        for(Customer cs:queue){
            System.out.println(cs);
        }

        // return all elements in the queue using lambda expression
        queue.stream().forEach(
                (nextElement) ->{System.out.println(nextElement);}
                              );
    }
}
