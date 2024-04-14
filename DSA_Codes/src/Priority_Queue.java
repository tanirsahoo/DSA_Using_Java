

import java.util.PriorityQueue;
import java.util.Scanner ;
import java.util.Collections;

public class Priority_Queue {
    public static void main(String[] args) {
//        System.out.println("Hello World.");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to have inside the array.");
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        pq.add(5) ;
        pq.add(15) ;
        pq.add(10) ;
        System.out.println("Size of the Priority Queue is: " + pq.size());
        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //peek() function only retrieves the top most element from the priority queue.
            pq.poll() ;// poll() function retrieves as well as deletes the top most element from the priority queue.
        }
    }
}
