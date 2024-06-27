//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29

import java.util.Scanner;

class data_t{
    int data ;
    public data_t(int data){
        this.data = data ;
    }
}

public class Burn_a_binary_tree {
    static int ans = -1 ;
    public static int minTime(node_tree root, int target){
        data_t depth = new data_t(-1) ;
        find_time(root , target , depth) ;
        return ans + 1 ;
    }
    public static int find_height(node_tree head){
        if(head == null)
            return 0 ;
        else
            return Math.max(find_height(head.left_child) , find_height(head.right_child)) + 1 ;
    }
    public static int find_time(node_tree<Integer> head , int target , data_t dat){
        if(head == null){
            return -1 ;
        }
        else if(head.data == target){
            dat.data = 1 ;
            return 1 ;
        }
        else{
            data_t ld = new data_t(-1) ;
            data_t rd = new data_t(-1) ;

            int left_height = find_time(head.left_child , target , ld) ;
            int right_height = find_time(head.right_child , target , rd) ;

            if(ld.data != -1){
                ans = Math.max(ans , ld.data + 1 + right_height) ;
                dat.data = ld.data + 1 ;
            }
            else if(rd.data != -1){
                ans = Math.max(ans , rd.data + 1 + left_height) ;
                dat.data = rd.data + 1 ;
            }
            return Math.max(left_height , right_height) + 1 ;
        }
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

        System.out.println("Enter the element you want to start burning from.");
        Scanner sc = new Scanner(System.in) ;
        int element = sc.nextInt() ;
        if(head.data == element)
            System.out.println("Time to burn the binary tree is: " + find_height(head));
        else
            System.out.println("Time to burn the binary tree is: " + minTime(head , element)) ;
    }
}
