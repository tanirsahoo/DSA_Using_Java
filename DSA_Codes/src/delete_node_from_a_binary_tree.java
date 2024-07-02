//            20
//            /\
//          10  50
//         /\    /\
//        5 15  30 80
//              /\
//            29  35

class modified_node{
    int data ;
    node_tree<Integer> node ;

    public modified_node(int data, node_tree<Integer> node) {
        this.data = data;
        this.node = node;
    }
}

public class delete_node_from_a_binary_tree {
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
                return fin ;
            }
        }
        return null ;
    }
    public static modified_node find_smallest(node_tree<Integer> head){
        node_tree<Integer> nd = head ;
        while(nd.left_child != null){
            nd = nd.left_child ;
        }
        head = delete_node(head , nd.data) ;
        modified_node node_new = new modified_node(nd.data , head) ;
        return node_new;
    }
    public static int find_largest(node_tree<Integer> head){
        node_tree<Integer> nd = head ;
        while(nd.right_child != null){
            nd = nd.right_child ;
        }
        head = delete_node(head , nd.data) ;
        return nd.data ;
    }
    public static node_tree delete_node(node_tree<Integer> head , int dat){
        if(head.data == dat){
            if(head.left_child == null && head.right_child != null)
                head = head.right_child ;
            else if(head.right_child == null && head.left_child != null)
                head = head.left_child ;
            else if(head.left_child == null && head.right_child == null)
                head = null ;
            else{
                modified_node n = find_smallest(head.right_child) ;
                head.data = n.data ;
                head.right_child = n.node ;
            }
        }
        else{
//            node_tree<Integer> index = find_node(head , dat) ;
            head = find_node(head , dat) ;
            if(head != null){
                if(head.left_child.data == dat){
                    if(head.left_child.left_child == null && head.left_child.right_child != null){
                        head.left_child = head.left_child.right_child ;
                    }
                    else if(head.left_child.right_child == null && head.left_child.left_child != null){
                        head.left_child = head.left_child.left_child ;
                    }
                    else if(head.left_child.left_child == null && head.left_child.right_child == null){
                        head.left_child = null ;
                    }
                    else{
                        modified_node n = find_smallest(head.left_child.right_child) ;
                        head.left_child.data = n.data ;
                        head.left_child.right_child = n.node ;
                    }
                }
                else if(head.right_child.data == dat){
                    if(head.right_child.right_child == null && head.right_child.left_child != null){
                        head.right_child = head.right_child.left_child ;
                    }
                    else if(head.right_child.left_child == null && head.right_child.right_child != null){
                        head.right_child = head.right_child.right_child ;
                    }
                    else if(head.right_child.left_child == null && head.right_child.right_child == null){
                        head.right_child = null ;
                    }
                    else{
                        modified_node n = find_smallest(head.right_child.right_child) ;
                        head.right_child.data = n.data ;
                        head.right_child.right_child = n.node ;
                    }
                }
            }
        }
        return head ;
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

        node_tree<Integer> index =  head;
        head = delete_node(head , 20) ;
    }
}
