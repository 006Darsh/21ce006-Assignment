// package Practical Assignment;
//This program is created by Aswani Darsh 21CE006
//Github link:-
/*Aim:-Create a class named Stack. Design a class named Queue for storing integers. Like a 
stack, a queue holds elements. In a stack, the elements are retrieved in a last-in firstout fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The 
class contains: 
• An int[] data field named elements that stores the int values in the queue. 
• A data field named size that stores the number of elements in the queue. 
• A constructor that creates a Queue object with default capacity 8.
• The method enqueue(int v) that adds v into the queue.
• The method dequeue() that removes and returns the element from the queue.
• The method empty() that returns true if the queue is empty. 
• The method getSize() that returns the size of the queue. */
import java.util.*;
public class Stack_queue_main {
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.enqueue(150);
        q.enqueue(100);
        q.enqueue(50);
        q.print();
        System.out.println("Size of the queue is :  "+q.getSize());
        q.dequeue();
       System.out.println(q.empty());
       q = new Queue();
       System.out.println(q.empty());

        Stack s = new Stack();
        s.enqueue(50);
        s.enqueue(100);
        s.enqueue(150);
        s.print();
        System.out.println("Size of the stack is :  "+s.getSize());
        s.dequeue();
       System.out.println(s.empty());
       s = new Stack();
       System.out.println(s.empty());
       System.out.println("This program is created by Aswani Darsh 21CE006");
    }

}
