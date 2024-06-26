import java.util.Scanner;

class numbo<DType>{
    DType data ;
    numbo<DType> nextnd ;
    numbo(DType data){
        this.data = data ;
    }
}

class reverse_list{
    public numbo<Integer> iterative_approach(numbo<Integer> head_node){
        numbo<Integer> curr = head_node ;
        numbo<Integer> prev = null ;
        if(curr.nextnd != null){
            prev = curr ;
            curr = curr.nextnd ;
            prev.nextnd = null ;
            while(curr.nextnd != null){
                numbo<Integer> reference = curr.nextnd ;
                curr.nextnd = prev ;
                prev = curr ;
                curr = reference ;
            }
            curr.nextnd = prev ;
        }
        else{
            prev = curr ;
        }
        return curr ;
    }

    public numbo<Integer> recursive_approach(numbo<Integer> head_node){
        if(head_node == null || head_node.nextnd == null){
            return head_node ;
        }
        numbo<Integer> newhead = recursive_approach(head_node.nextnd) ;
        numbo<Integer> nextnode = head_node.nextnd ;
        nextnode.nextnd = head_node ;
        head_node.nextnd = null ;
        return newhead ;
    }


    public void display_list(numbo<Integer> head_node){
        numbo<Integer> nd = head_node ;
        do{
            System.out.println("The elements are: " + nd.data);
            nd = nd.nextnd ;
        }while(nd != null) ;
    }
}

public class reverse_a_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the data inside the head node.");
        int data = sc.nextInt() ;
        numbo<Integer> n1 = new numbo<>(data) ;
        n1.nextnd = null ;
        numbo<Integer> n2 = n1 ;
        int ch = 1 ;
        while(true){
            System.out.println("Enter your choice.");
            ch = sc.nextInt() ;
            if(ch != 1)
                break ;
            else{
                System.out.println("Enter the next element.");
                int nextItem = sc.nextInt() ;
                numbo<Integer> n3 = new numbo<>(nextItem);
                n1.nextnd = n3 ;
                n3.nextnd = null ;
                n1 = n3 ;
            }
        }
        reverse_list ob = new reverse_list() ;
        System.out.println("Initial Linked List:");
        ob.display_list(n2);
        System.out.println("After reversing the list:");
//        n2 = ob.iterative_approach(n2) ;
        n2 = ob.recursive_approach(n2) ;
        ob.display_list(n2);
    }
}
