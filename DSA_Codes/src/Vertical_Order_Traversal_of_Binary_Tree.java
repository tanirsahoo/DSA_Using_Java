//            20
//            /\
//          10  50
//         /\    /\
//        5 15  30 80
//              /\
//            29  35


import java.util.* ;
import java.util.stream.Collector;

class node_treat{
    int data ;
    node_tree node ;
    node_treat(int data , node_tree node){
        this.data = data ;
        this.node = node ;
    }
}

public class Vertical_Order_Traversal_of_Binary_Tree {

    public static void print_order(node_tree<Integer> head){
        Map<Integer , ArrayList> mp = new HashMap<>() ;
        Queue<node_treat> q = new LinkedList<>() ;
        node_treat nd = new node_treat(0 , head) ;
        if(head != null) {
            q.add(nd);
        }
        while(!q.isEmpty()){
            node_treat n = q.poll() ;
            if(n.node.left_child != null) {
                node_treat ko = new node_treat(n.data - 1 , n.node.left_child) ;
                q.add(ko) ;
            }
            if(n.node.right_child != null) {
                node_treat ko = new node_treat(n.data + 1 , n.node.right_child) ;
                q.add(ko) ;
            }
            if(mp.get(n.data) == null){
                ArrayList<Integer> ar = new ArrayList<>() ;
                ar.add((Integer) n.node.data) ;
                mp.put(n.data , ar) ;
            }
            else{
                ArrayList<Integer> ar = mp.get(n.data) ;
                ar.add((Integer) n.node.data) ;
                mp.put(n.data , ar) ;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(mp.keySet()) ;
        Collections.sort(list);
        for(int item:list){
            System.out.println(mp.get(item));
        }
    }
    public static void main(String[] args) {
        node_tree<Integer> head = new node_tree<>(20) ;
        node_tree<Integer> nd1 = new node_tree<>(10) ;
        node_tree<Integer> nd2 = new node_tree<>(50) ;
        node_tree<Integer> nd3 = new node_tree<>(5) ;
        node_tree<Integer> nd4 = new node_tree<>(15) ;
        node_tree<Integer> nd5 = new node_tree<>(30) ;
        node_tree<Integer> nd6 = new node_tree<>(80) ;
        node_tree<Integer> nd7 = new node_tree<>(29) ;
        node_tree<Integer> nd8 = new node_tree<>(35) ;

        head.left_child = nd1 ;
        head.right_child = nd2 ;

        nd1.left_child = nd3 ;
        nd1.right_child = nd4 ;

        nd2.left_child = nd5 ;
        nd2.right_child = nd6 ;

        nd5.left_child = nd7 ;
        nd5.right_child = nd8 ;

        print_order(head) ;
    }
}
