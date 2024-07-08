package Collection_Framework;

import java.util.* ;

public class priority_queue_using_Collection_framework {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()) ;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(3) ;
        pq.add(26) ;
        pq.add(15) ;
        pq.add(30) ;
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        if(pq.peek() < n) {
            pq.poll();
            pq.add(n);
        }
        System.out.println(pq);
        System.out.println("Third Largest element is: " + pq.peek());
    }
}
