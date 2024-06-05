//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29
/*
* Q1. Find the number of nodes in a binary tree.
* Q2. Find the node with maximum value.
* */

public class size_of_Binary_tree {
    private static int size_of_tree(node_tree head){
        if(head == null)
            return 0 ;
        else
            return size_of_tree(head.left_child) + size_of_tree(head.right_child) + 1 ;
    }
    private static int max_value(node_tree head){
        if(head == null)
            return Integer.MIN_VALUE ;
        else
            return Math.max((Integer) head.data , Math.max(max_value(head.right_child) , max_value(head.left_child))) ;
    }
    private static int min_value(node_tree head){
        if(head == null)
            return Integer.MAX_VALUE ;
        else
            return Math.min((Integer) head.data , Math.min(min_value(head.right_child) , min_value(head.left_child))) ;
    }
    public static void main(String[] args) { // node_tree class is already present inside Height_of_Binary_tree.java program
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

//        System.out.println("Height of the tree is: " + size_of_tree(head));
        System.out.println("Max Value of the tree is: " + max_value(head));
        System.out.println("Min Value of the tree is: " + min_value(head));
    }
}
