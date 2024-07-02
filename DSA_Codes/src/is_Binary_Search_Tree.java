//            20
//            /\
//          10  50
//         /\    /\
//        5 15  30 80
//              /\
//            29  35
public class is_Binary_Search_Tree {
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
    }
}
