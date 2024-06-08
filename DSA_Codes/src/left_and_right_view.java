//  -->          15           <--
//              /\
//  -->        20  19         <--
//            /\    /\
//  -->     42 26  35 38      <--
//          /
//  -->    29                 <--


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class left_and_right_view {

    private static void left_view(node_tree head){
        HashMap<Integer , node_tree> h = new HashMap<>() ;
        Queue<node_tree> q = new LinkedList<>() ;
        q.add(head) ;
        int i = 0 ;
        h.put(i ++, q.peek()) ;
        q.add(null);
        while (!q.isEmpty()){
            if(q.peek().left_child != null)
                q.add(q.peek().left_child) ;
            if(q.peek().right_child != null)
                q.add(q.peek().right_child) ;
            q.poll() ;
            if(q.peek() == null){
                q.poll() ;
                if(!q.isEmpty()) {
                    q.add(null);
                    if (h.get(i) == null)
                        h.put(i++, q.peek());
                }
            }
        }
        for(int k = 0 ; k < i ; k ++)
            System.out.println(h.get(k).data + " ");
    }
    private static void right_view(node_tree head){
        HashMap<Integer , node_tree> h = new HashMap<>() ;
        Queue<node_tree> q = new LinkedList<>() ;
        q.add(head) ;
        int i = 0 ;
        h.put(i ++, q.peek()) ;
        q.add(null);
        while (!q.isEmpty()){
            if(q.peek().right_child != null)
                q.add(q.peek().right_child) ;
            if(q.peek().left_child != null)
                q.add(q.peek().left_child) ;
            q.poll() ;
            if(q.peek() == null){
                q.poll() ;
                if(!q.isEmpty()) {
                    q.add(null);
                    if (h.get(i) == null)
                        h.put(i++, q.peek());
                }
            }
        }
        for(int k = 0 ; k < i ; k ++)
            System.out.println(h.get(k).data + " ");
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

        left_view(head);
        System.out.println("===============================");
        right_view(head);
    }
}
