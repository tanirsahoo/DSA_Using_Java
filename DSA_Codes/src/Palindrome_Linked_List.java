import java.util.Scanner;

class nd<DType>{
    DType data ;
    nd nextnd ;
    nd(DType data){
        this.data = data ;
    }
}

class palindrome_ll_Operations{

    public nd<Character> reverse_middle(nd<Character> head_node){
        if(head_node == null || head_node.nextnd == null){
            return head_node ;
        }
        nd<Character> newhead = reverse_middle(head_node.nextnd) ;
        nd<Character> nextnode = head_node.nextnd ;
        nextnode.nextnd = head_node ;
        head_node.nextnd = null ;
        return newhead ;
    }

    public nd<Character> find_middle(nd<Character> head){
        nd<Character> cntr = head ;
        nd<Character> fast = head ;
        while(fast != null && fast.nextnd != null){
            cntr = cntr.nextnd ;
            fast = fast.nextnd.nextnd ;
        }
        return cntr ;
    }

    public boolean check_Palindrome(nd<Character> head){
        if(head == null)
            return false ;
        nd<Character> middle_index = find_middle(head) ;
        nd<Character> reverse_index = reverse_middle(middle_index.nextnd) ;
        while(reverse_index != null){
            if(head.data != reverse_index.data){
                return false ;
            }
            head = head.nextnd ;
            reverse_index = reverse_index.nextnd ;
        }
        return true ;
    }
}

public class Palindrome_Linked_List {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        nd<Character> node1 = new nd<>('K') ;
        nd<Character> node2 = new nd<>('A') ;
        nd<Character> node3 = new nd<>('T') ;
        nd<Character> node4 = new nd<>('A') ;
        nd<Character> node5 = new nd<>('K') ;

        node1.nextnd = node2 ;
        node2.nextnd = node3 ;
        node3.nextnd = node4 ;
        node4.nextnd = node5 ;
        node5.nextnd = null ;

        palindrome_ll_Operations ob = new palindrome_ll_Operations() ;
        boolean check = ob.check_Palindrome(node1) ;
        System.out.println(check ? "It's a Palindrome LinkedList" : "It's not a Palindrome Linked List.");
    }
}
