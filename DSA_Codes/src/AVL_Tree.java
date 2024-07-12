//An AVL tree is a special kind of binary search tree that automatically balances itself.
// This guarantees that search, insertion, and deletion operations all take roughly the same amount of time,
// regardless of the order the data is added.  They are named after their inventors, Adelson-Velsky and Landis.

/*
* In AVL Tree there is a concept of height balance
* Balance Factor: |height(left sub tree) - height(right_sub_tree)|
* in AVL tree the Balance factor must be <= 1
*
* Rotations:
* LL Rotation (Left-Left): This occurs when a new node is inserted into the left subtree of a node that already
*                          has a left-heavy imbalance (balance factor of 2). The rotation corrects the imbalance
*                          by making the left child of the imbalanced node the new root and the original node its
*                          right child.
*
* RR Rotation (Right-Right): This is the mirror image of an LL rotation. It happens when a new node is inserted into
*                            the right subtree of a node that already has a right-heavy imbalance (balance factor of
*                            -2). The rotation promotes the right child of the imbalanced node to be the new root and
*                            the original node becomes its left child.
*
*LR Rotation (Left-Right): This is a double rotation used when the new node is inserted into the right subtree of
*                          a left-heavy node. It involves a left rotation on the right child of the imbalanced node
*                          followed by a right rotation on the imbalanced node itself.
*
*RL Rotation (Right-Left): This is the opposite of an LR rotation. It occurs when the new node is inserted into the
*                          left subtree of a right-heavy node. Here, a right rotation is performed on the left child
*                          of the imbalanced node, followed by a left rotation on the imbalanced node itself.
* */
public class AVL_Tree {
    public static nd_tre avl_operation(nd_tre<Integer> head , int data){
        operations_on_bst ob = new operations_on_bst() ;
        ob.insertion(head , data) ;
        if(balance_factor(head) > 1 && data < head.left_nd.data) // LL-Operation
        {
            nd_tre nd = head.left_nd ;
            nd.right_nd = head ;
            head.left_nd = null ;
            head = nd ;
        }
        if(balance_factor(head) < -1 && data > head.right_nd.data) // RR-Operation
        {
            nd_tre nd = head.right_nd ;
            nd.left_nd = head ;
            head.right_nd = null ;
            head = nd ;
        }
        if(balance_factor(head) > 1 && data > head.left_nd.data) // LR-Operation
        {
            nd_tre nd = head.left_nd ;
            nd_tre nd_next = head.left_nd.right_nd ;
            head.left_nd = nd_next ;
            nd_next.left_nd = nd ;
            nd.right_nd = null ;
            nd_next.right_nd = head ;
            head.left_nd = null ;
            head = nd_next ;
        }
        if(balance_factor(head) < -1 && data < head.right_nd.data) // RL-Operation
        {
            nd_tre nd = head.right_nd ;
            nd_tre nd_next = head.right_nd.left_nd ;
            head.right_nd = nd_next ;
            nd_next.right_nd = nd ;
            nd.left_nd = null ;
            nd_next.left_nd = head ;
            head.right_nd = null ;
            head = nd_next ;
        }
        return head ;
    }
    private static int balance_factor(nd_tre<Integer> head){
        return compute_height(head.left_nd) - compute_height(head.right_nd) ;
    }
    private static int compute_height(nd_tre<Integer> head){
        if (head == null)
            return 0 ;
        else{
            return (Math.max(compute_height(head.left_nd) , compute_height(head.right_nd)) + 1);
        }
    }
    private static void display(nd_tre<Integer> head){
        if(head.left_nd != null)
            display(head.left_nd);
        System.out.print(head.data + " ");
        if(head.right_nd != null)
            display(head.right_nd);
    }
    public static void main(String[] args) {
//        nd_tre<Integer> head = new nd_tre<>(20) ;
//        head = avl_operation(head , 15) ;
//        head = avl_operation(head , 5) ;


//        nd_tre<Integer> head = new nd_tre<>(5) ;
//        head = avl_operation(head , 15) ;
//        head = avl_operation(head , 20) ;


//        nd_tre<Integer> head = new nd_tre<>(20) ;
//        head = avl_operation(head , 5) ;
//        head = avl_operation(head , 15) ;
//
//
        nd_tre<Integer> head = new nd_tre<>(5) ;
        head = avl_operation(head , 20) ;
        head = avl_operation(head , 15) ;


        display(head);
        System.out.println();
    }
}