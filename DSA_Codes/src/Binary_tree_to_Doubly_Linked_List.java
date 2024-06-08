//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29

class double_flat{
    int data ;
    double_flat next_node;
    double_flat prev_node;
    public double_flat(int data, double_flat next_node, double_flat prev_node) {
        this.data = data;
        this.next_node = next_node;
        this.prev_node = prev_node;
    }
}

public class Binary_tree_to_Doubly_Linked_List {
    double_flat node = new double_flat(Integer.MIN_VALUE , null , null) ;
    double_flat nd = node ;
    public void inorder_algo(node_tree head){
        double_flat root = new double_flat((Integer) head.data, null , null) ;
        if(head.left_child != null)
            inorder_algo(head.left_child) ;
        nd.next_node = root ;
        root.prev_node = nd ;
        nd = root ;
        if(head.right_child != null)
            inorder_algo(head.right_child) ;
    }
    public void display_list(){
        node = node.next_node ;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next_node ;
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

        Binary_tree_to_Doubly_Linked_List ob = new Binary_tree_to_Doubly_Linked_List() ;
        ob.inorder_algo(head);
        ob.display_list();
    }
}
