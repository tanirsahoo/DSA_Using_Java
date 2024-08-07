//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29

class node_tree<DType>{
    DType data ;
    node_tree<DType> left_child ;
    node_tree<DType> right_child ;
    node_tree(DType dat){
        this.data = dat ;
        this.left_child = null ;
        this.right_child = null ;
    }
}

class find_height{
    public int find_height_tree(node_tree<Integer> head){
        if (head == null)
            return 0 ;
        else{
            return (Math.max(find_height_tree(head.left_child) , find_height_tree(head.right_child)) + 1);
        }
    }
}

public class Height_of_Binary_tree {
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

        find_height ob = new find_height() ;
        int height = ob.find_height_tree(head);
        System.out.println("The Height of the tree is: " + height);
    }
}
