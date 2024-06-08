//  -->          15           <--
//              /\
//  -->        20  19         <--
//            /\    /\
//  -->     42 26  35 38      <--
//          /
//  -->    29                 <--


import java.util.*;

class horizon_dist{
    int horiz_val ;
    node_tree node ;

    public horizon_dist(int horiz_val, node_tree node) {
        this.horiz_val = horiz_val;
        this.node = node;
    }

}

public class left_right_top_bottom_view_of_binary_tree {

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
    private static void top_view(node_tree head){
        HashMap<Integer , node_tree> ht = new HashMap<>() ;
        Queue<horizon_dist> qu = new LinkedList<>() ;
        horizon_dist hd = new horizon_dist(0 , head) ;
        qu.add(hd) ;
        ht.put(hd.horiz_val , hd.node) ;
        while (!qu.isEmpty()){
            if(qu.peek().node.left_child != null) {
                hd = new horizon_dist(qu.peek().horiz_val - 1 , qu.peek().node.left_child) ;
                qu.add(hd);
                if(ht.get(hd.horiz_val) == null){
                    ht.put((hd.horiz_val) , hd.node) ;
                }
            }
            if(qu.peek().node.right_child != null) {
                hd = new horizon_dist(qu.peek().horiz_val + 1 , qu.peek().node.right_child) ;
                qu.add(hd);
                if(ht.get(hd.horiz_val) == null){
                    ht.put((hd.horiz_val) , hd.node) ;
                }
            }
            qu.poll() ;
        }
        for (int item: ht.keySet()) {
            System.out.print(ht.get(item).data + " ");
        }
        System.out.println();
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
        System.out.println("===============================");
        top_view(head) ;
    }
}
