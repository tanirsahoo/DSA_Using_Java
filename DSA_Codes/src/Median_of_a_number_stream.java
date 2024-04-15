/*
This problem involves designing an algorithm that can efficiently compute the median of a continuous stream of integers. The algorithm should be able to ingest a sequence of numbers and report the median value after each new integer is added to the stream.
* */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Median_of_a_number_stream {
    public static void main(String[] args) {
        int ch = 1 , num ;
        Scanner sc = new Scanner(System.in) ;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>() ; // pq1 --> It's a minheap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()) ; //pq2 --> It's a maxheap
        System.out.println("Enter a new  number.");
        num = sc.nextInt() ;
        pq2.add(num) ;
        int median = num ;
        while(ch == 1){
            System.out.println("Enter a new number");
            num = sc.nextInt() ;
            if(num > median)
                pq1.add(num) ;
            else
                pq2.add(num) ;
            if(pq1.size() < pq2.size())
                pq1.add(pq2.poll()) ;
            else if(pq1.size() > pq2.size())
                pq2.add(pq1.poll()) ;
            if(pq1.size() == pq2.size()){
                median = (pq1.peek() + pq2.peek()) / 2 ;
            }
            else{
                median = pq2.peek() ;
            }
            System.out.println("The Final Median is: " + median);
            System.out.println("Press 1 to continue entering the number stream and press any other number to exit the execution window.");
            ch = sc.nextInt() ;
        }
    }
}
