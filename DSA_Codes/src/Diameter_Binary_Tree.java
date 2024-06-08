//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29

public class Diameter_Binary_Tree {

    private static int height(node_tree head){
        if(head == null)
            return 0 ;
        return Math.max(height(head.left_child) , height(head.right_child)) + 1 ;
    }
    private static int diameter(node_tree head){ //The time complexity for this function is O(n^2)
        if(head == null)
            return 0 ;
        int d1 = diameter(head.left_child) ;
        int d2 = diameter(head.right_child) ;
        int ht = height(head.left_child) + height(head.right_child) + 1 ;
        return Math.max(ht , Math.max(d1 , d2)) ;
    }
    private static int ans = 0 ;
    private static int dia_in_n(node_tree head){ // The time complexity for this function is O(n)
        if(head == null)
            return 0 ;
        int l1 = dia_in_n(head.left_child) ;
        int l2 = dia_in_n(head.right_child) ;
        ans = Math.max(ans, (1 + l1 + l2)) ;
        return 1 + Math.max(l1 , l2) ;
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

//        System.out.println("The Diameter is (Number of nodes in the longest path): " + diameter(head));
        dia_in_n(head) ;
        System.out.println("The Diameter is (Number of nodes in the longest path): " + ans);
    }
}
