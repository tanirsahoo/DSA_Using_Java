//            15
//            /\
//          20  19
//         /\    /\
//       42 26  35 38
//       /
//      29


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lowest_common_ancester_in_binary_tree {

    private static node_tree ancester_node(node_tree head, int n1 , int n2){
        if(head == null)
            return null ;
        else if ((Integer) head.data == n1 || (Integer)head.data == n2)
            return head;
        node_tree h1 = ancester_node(head.left_child , n1 , n2) ;
        node_tree h2 = ancester_node(head.right_child , n1 , n2) ;
        if(h1 == null)return h2;
        if(h2 == null) return h1;
        return head ;
    }

    public static void main(String[] args)throws IOException {
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("Enter the value of First Node: ");
        int n1 = Integer.parseInt(br.readLine()) ;
        System.out.println("Enter the value of Second Node: ");
        int n2 = Integer.parseInt(br.readLine()) ;
        if(ancester_node(head , n1 , n2) != null)
            System.out.println("Ancester Node of N1 and N2 is: " + ancester_node(head , n1 , n2).data);
        else
            System.out.println("No such node as N1 and N2");
    }
}
