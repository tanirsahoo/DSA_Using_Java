package Collection_Framework;

import java.util.ArrayDeque;

public class Deque_in_Collection_Framework {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>() ;

        dq.add(20) ;
        dq.add(15) ;
        dq.add(29) ;
        dq.add(19) ;
        dq.add(30) ;
        dq.add(47) ;
        dq.add(22) ;

        dq.addFirst(22);
        dq.pollLast() ;
        dq.pollLast() ;
        System.out.println(dq) ;
        dq.pollFirst() ;
    }
}
