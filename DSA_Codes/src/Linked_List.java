import java.util.Scanner;

//class node{
//    int data ;
//    node nextnode ;
//    node(int data){
//        this.data = data ;
//    }
//}

class node<DType>{
    DType data ;
    node<DType> nextnode ;
    node(DType data){
        this.data = data ;
    }
}

class traverseList{
    public void display_elems(node<Integer> headnode){
        node newnode = headnode ;
        do{
            System.out.println("The element is: " + newnode.data);
            newnode = newnode.nextnode ;
        }while(newnode!= null) ;
    }
}

public class Linked_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the data inside the head node.");
        int data = sc.nextInt() ;
        node<Integer> n1 = new node<Integer>(data) ;
        n1.nextnode = null ;
        node<Integer> n2 = n1 ;
        int ch = 1 ;
        while(true){
            System.out.println("Enter your choice.");
            ch = sc.nextInt() ;
            if(ch != 1)
                break ;
            else{
                System.out.println("Enter the next element.");
                int nextItem = sc.nextInt() ;
                node<Integer> n3 = new node<Integer>(nextItem);
                n1.nextnode = n3 ;
                n3.nextnode = null ;
                n1 = n3 ;
            }
        }
        traverseList ob = new traverseList() ;
        ob.display_elems(n2);
    }
}
