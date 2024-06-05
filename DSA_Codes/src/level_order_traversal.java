//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29


import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversal {
    private static void algorithm_level_order(node_tree head){
        Queue<node_tree> q = new LinkedList<>() ;
        q.add(head) ;
        while(!q.isEmpty()){
            System.out.print(q.peek().data + " ");
            if(q.peek().left_child != null)
                q.add(q.peek().left_child) ;
            if(q.peek().right_child != null)
                q.add(q.peek().right_child) ;
            q.poll() ;
        }
    }
    private static void algorithm_level_order_lineby_line_print(node_tree head){
        Queue<node_tree> q = new LinkedList<>() ;
        q.add(head);
        q.add(null) ;
        while(!q.isEmpty()){
            if(q.peek() == null){
                q.poll();
                if(q.isEmpty())
                    return ;
                q.add(null) ;
                System.out.println();
            }
            System.out.print(q.peek().data + " ");
            if(q.peek().left_child != null)
                q.add(q.peek().left_child) ;
            if(q.peek().right_child != null)
                q.add(q.peek().right_child) ;
            q.poll() ;
        }
    }
    public static void main(String[] args) {
        node_tree<Integer> head = new node_tree<>(15) ;
        node_tree<Integer> nd1 = new node_tree<>(20) ;
        node_tree<Integer> nd2 = new node_tree<>(19) ;
        node_tree<Integer> nd3 = new node_tree<>(42) ;
        node_tree<Integer> nd4 = new node_tree<>(26) ;
        node_tree<Integer> nd5 = new node_tree<>(35) ;
        node_tree<Integer> nd6 = new node_tree<>(38) ;
        node_tree<Integer> nd7 = new node_tree<>(29) ;

        head.left_child = nd1 ;
        head.right_child = nd2 ;

        nd1.left_child = nd3 ;
        nd1.right_child = nd4 ;

        nd2.left_child = nd5 ;
        nd2.right_child = nd6 ;

        nd3.left_child = nd7 ;
        nd3.right_child = null ;

        nd4.left_child = null ;
        nd4.right_child = null ;

        nd5.left_child = null ;
        nd5.right_child = null ;

        nd6.left_child = null ;
        nd6.right_child = null ;

        nd7.left_child = null ;
        nd7.right_child = null ;
//        algorithm_level_order(head) ;
        algorithm_level_order_lineby_line_print(head) ;
    }
}
