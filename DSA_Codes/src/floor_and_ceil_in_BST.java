//            20
//            /\
//          10  50
//         /\    /\
//        5 15  30 80
//              /\
//            29  35

public class floor_and_ceil_in_BST {
    public static node_tree find_node(node_tree head , int elem){
        node_tree<Integer> node = head ;
        node_tree<Integer> fin = null ;
        while(node != null){
            if(node.data < elem){
                fin = node ;
                node = node.right_child ;
            }
            else if(node.data > elem){
                fin = node ;
                node = node.left_child ;
            }
            else{
                fin = node ;
                return fin ;
            }
        }
        return null ;
    }
    public static node_tree find_floor(node_tree<Integer> head , int elem){
        node_tree<Integer> nd = null;
        while(head != null){
            if(head == null)
                return nd;
            else if(head.data < elem) {
                nd = head ;
                head = head.right_child;
            }
            else if(head.data > elem){
                head = head.left_child ;
            }
            else{
                return head ;
            }
        }
        return nd ;
    }
    public static node_tree find_ceil(node_tree<Integer> head , int elem){
        node_tree<Integer> nd = null;
        while(head != null){
            if(head == null)
                return nd;
            else if(head.data > elem) {
                nd = head ;
                head = head.left_child;
            }
            else if(head.data < elem){
                head = head.right_child ;
            }
            else{
                return head ;
            }
        }
        return nd ;
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
        node_tree<Integer> floor_val1 = find_floor(head , 16) ;
        node_tree<Integer> floor_val2 = find_ceil(head , 40) ;
        if(floor_val1 != null && floor_val2 != null) {
            System.out.println("The Floor Value is: " + floor_val1.data);
            System.out.println("The Ceil Value is: " + floor_val2.data);
        }
        else {
            System.out.println("The Floor Value is: " + Integer.MAX_VALUE);
            System.out.println("The Ceil Value is: " + Integer.MIN_VALUE);
        }
    }
}
