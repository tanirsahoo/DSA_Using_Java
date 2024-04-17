/*
Floyd's Cycle Detection Algorithm efficiently detects cycles in linked lists. It uses two pointers, slow and fast, that traverse the list at different speeds.
If a cycle exists, the fast pointer will eventually overtake the slow pointer. By resetting the slow pointer and continuing traversal with both pointers meeting again,
the cycle's starting point can be found. This algorithm offers a time complexity of O(n) and uses constant extra space.
* */

import java.sql.SQLOutput;

class nod<DType>{
    DType data ;
    nod nextnd ;
    nod (DType data){
        this.data = data ;
    }
}

class Floyd_Algorithm{
    public void cycle_index(nod<Integer> head){
        nod<Integer> slow = head ;
        nod<Integer> fast = head ;
        if(head.nextnd == null){
            System.out.println("No Cycle is present in the linked list.");
        }
        else{
            do{
                slow = slow.nextnd ;
                fast = fast.nextnd.nextnd ;
            }while(slow != fast && (fast != null && fast.nextnd != null)) ;
            if(fast == null || fast.nextnd == null)
                System.out.println("No Cycle is present in the linked list.");
            else{
                System.out.println("Cycle is present in this list.");
                nod<Integer> find_node = head ;
                while(find_node != slow){
                    find_node = find_node.nextnd ;
                    slow = slow.nextnd ;
                }
                System.out.println("The Cycle starts from element: " + slow.data);
            }
        }
    }
//    public nod<Integer> cycle_index(nod<Integer> head){
//
//    }
}

public class Floyds_Cycle_Detection_Algorithm {
    public static void main(String[] args) {
        nod<Integer> node1 = new nod<>(10) ;
        nod<Integer> node2 = new nod<>(15) ;
        nod<Integer> node3 = new nod<>(40) ;
        nod<Integer> node4 = new nod<>(16) ;
        nod<Integer> node5 = new nod<>(28) ;
        nod<Integer> node6 = new nod<>(56) ;
        nod<Integer> node7 = new nod<>(92) ;
        nod<Integer> node8 = new nod<>(34) ;

        node1.nextnd = node2 ;
        node2.nextnd = node3 ;
        node3.nextnd = node4 ;
        node4.nextnd = node5 ;
        node5.nextnd = node6 ;
        node6.nextnd = node7 ;
        node7.nextnd = node8 ;
        node8.nextnd = node6 ;

        Floyd_Algorithm ob = new Floyd_Algorithm() ;
        ob.cycle_index(node1);
    }
}
