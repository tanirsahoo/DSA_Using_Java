/*
Finding the Kth Largest Element from a given array of numbers. To Solve this problem we need to design a priority queue(Min heap) using PriorityQueue class from Collections Library of Java.
Insert k elements inside the array at first and then start inserting the other elements inside the heap. The last min/max element inside the heap is the Kth Largest or Smallest element.
* */

import java.util.PriorityQueue;
import java.util.Scanner ;
import java.util.Collections;

public class Priority_Queue {
    public static void main(String[] args) {
//        System.out.println("Hello World.");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to have inside the array.");
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
//        pq.add(5) ;
//        pq.add(15) ;
//        pq.add(10) ;
//        System.out.println("Size of the Priority Queue is: " + pq.size());
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek()); //peek() function only retrieves the top most element from the priority queue.
//            pq.poll() ;// poll() function retrieves as well as deletes the top most element from the priority queue.
//        }
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have inside the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element inside the array at index: " + (i + 1));
            ar[i] = sc.nextInt() ;
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt() ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder(Collections.reverseOrder())) ;
        for(int i = 0 ; i < k ; i ++){
            pq.add(ar[i]) ;
        }
        for(int i = k ; i < n ; i ++){
            if(pq.peek() < ar[i]){
                pq.poll() ;
                pq.add(ar[i]) ;
            }
        }
        System.out.println("The Kth largest element is: " + pq.peek());
    }
}
