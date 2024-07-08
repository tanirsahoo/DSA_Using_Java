package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class queue_in_Collection_framework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;

        q.add(15) ;
        q.add(45) ;
        q.add(25) ;
        q.add(75) ;
        q.add(85) ;

        System.out.println(q);
        q.poll() ;
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
