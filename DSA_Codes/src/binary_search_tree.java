import java.util.Scanner ;

class nd_tre<DType>{
    DType data;
    nd_tre<DType> left_nd = null;
    nd_tre<DType> right_nd = null;

    public nd_tre(DType data) {
        this.data = data;
    }
}
class operations_on_bst{
    public static nd_tre find_insert_index(nd_tre<Integer> head , int elem){ // Recursive Approach
        if(head.left_nd == null && head.right_nd == null)
            return head ;
        else if((head.data > elem) && (head.left_nd != null)) {
            return find_insert_index(head.left_nd, elem);
        }
        else if((head.data < elem) && (head.right_nd != null))
            return find_insert_index(head.right_nd, elem) ;
        else
            return head ;
    }

    public static nd_tre find_index(nd_tre<Integer> head , int elem){ // Iterative Approach
        nd_tre<Integer> node = head ;
        nd_tre<Integer> fin = null ;
        while(node != null){
            if(node.data < elem){
                fin = node ;
                node = node.right_nd ;
            }
            else if(node.data > elem){
                fin = node ;
                node = node.left_nd ;
            }
            else{
                fin = node ;
                break ;
            }
        }
        return fin ;
    }
    public static nd_tre insertion(nd_tre<Integer> head , int elem){
        nd_tre hd = head ;
//        nd_tre<Integer> index = find_insert_index(hd , elem) ;
        nd_tre<Integer> index = find_index(hd , elem) ;
        nd_tre node = new nd_tre(elem) ;
        if(index.data == elem)
            return head ;
        else if(index.data > elem) {
            index.left_nd = node;
            return head ;
        }
        else {
            index.right_nd = node;
            return head ;
        }
    }
    public static void display(nd_tre<Integer> head){
        if(head.left_nd != null)
            display(head.left_nd);
        System.out.println(head.data);
        if(head.right_nd != null)
            display(head.right_nd);
    }
}
public class binary_search_tree {
    public static void main(String[] args) {
        operations_on_bst ob = new operations_on_bst() ;
        nd_tre<Integer> head ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the head element");
        int elem = sc.nextInt() ;
        head = new nd_tre(elem) ;
        System.out.println("Insert -1 to stop the iteration.");
        int ch = 1 ;
        while(ch != -1){
            ch = sc.nextInt() ;
            System.out.println("Enter the element to insert.");
            int em = sc.nextInt() ;
            head = ob.insertion(head , em) ;
        }
    }
}
