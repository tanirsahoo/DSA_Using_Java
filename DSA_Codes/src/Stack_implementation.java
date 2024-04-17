import java.util.ArrayList;
import java.util.Scanner;

class stack_implementation_array{
    Scanner sc = new Scanner(System.in) ;
    int top , array_size ;
    int[] ar ;
    stack_implementation_array(){}
    stack_implementation_array(int size){
        this.array_size = size ;
        top = -1 ;
        ar = new int[size] ;
    }
    public void push(int data){
        if(top == (array_size - 1))
            System.out.println("Array Overflow.");
        else{
            top ++ ;
            ar[top] = data ;
        }
    }
    public int pop(){
        if(top == -1)
            return -1 ;
        else{
            return ar[top --] ;
        }
    }
    public void peek(){
        if (top == -1)
            System.out.println("No element found inside the array.");
        else
            System.out.println("The Element is: " + ar[top]);
    }
    public void display_elems(){
        for(int i = 0 ; i <= top ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
    public void operate_stack(){
        System.out.println("Enter the size of the array you want to have");
        int n = sc.nextInt() ;
        int ch = 1 ;
        stack_implementation_array ob = new stack_implementation_array(n) ;
        while(true){
            System.out.println("Enter your choice for the desired stack operation: 1: For Element insertion , 2: For Element Deletion, 3: Peek Operation, 4: To Display the stack and any other input to exit.");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the element you want to insert.");
                int num = sc.nextInt() ;
                ob.push(num);
            } else if (ch == 2) {
                int p = ob.pop() ;
                if(p == -1)
                    System.out.println("No Element inside the array.");
                else
                    System.out.println("The Popped element is: " + p);
            } else if (ch == 3) {
                ob.peek();
            } else if (ch == 4) {
                ob.display_elems();
            } else
                break ;
        }
    }
}
class stack_implementation_ArrayList{
    Scanner sc = new Scanner(System.in) ;
    ArrayList<Integer> ar = new ArrayList<>() ;
    int top = -1;
    public void push(int data){
        top ++ ;
        ar.add(data) ;
    }
    public int pop(){
        if(top == -1)
            return -1 ;
        else{
            int elem = ar.get(top) ;
            ar.remove(top --) ;
            return elem ;
        }
    }
    public void peek(){
        if (top == -1)
            System.out.println("No element found inside the array.");
        else
            System.out.println("The Element is: " + ar.get(top));
    }
    public void display_elems(){
        for(int i = 0 ; i <= top ; i ++)
            System.out.print(ar.get(i) + " ");
        System.out.println();
    }
    public void operate_stack(){
        int ch = 1 ;
        stack_implementation_ArrayList ob = new stack_implementation_ArrayList() ;
        while(true){
            System.out.println("Enter your choice for the desired stack operation: 1: For Element insertion , 2: For Element Deletion, 3: Peek Operation, 4: To Display the stack and any other input to exit.");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the element you want to insert.");
                int num = sc.nextInt() ;
                ob.push(num);
            } else if (ch == 2) {
                int p = ob.pop() ;
                if(p == -1)
                    System.out.println("No Element inside the array.");
                else
                    System.out.println("The Popped element is: " + p);
            } else if (ch == 3) {
                ob.peek();
            } else if (ch == 4) {
                ob.display_elems();
            } else
                break ;
        }
    }
}
class stack_implementation_LinkedList {
    class node_formation<Dtype> {
        Dtype data;
        node_formation<Dtype> nextnd;

        node_formation(Dtype data) {
            this.data = data;
        }
    }

    Scanner sc = new Scanner(System.in);
    int top = -1;
    node_formation<Integer> head, reference;

    public void insertion_operation(int data) {
        if (top == -1) {
            reference = new node_formation<>(data);
            reference.nextnd = null;
            top++;
        } else {
            node_formation<Integer> next_node = new node_formation<>(data);
            next_node.nextnd = reference;
            reference = next_node;
            top++;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        } else {
            node_formation<Integer> vd = reference.nextnd;
            int dat = reference.data;
            reference.nextnd = null;
            reference = vd;
            top--;
            return dat;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("No element inside the Stack.");
        } else {
            System.out.println("The Element is: " + reference.data);
        }
    }

    public void display_stack() {
        head = reference;
        do {
            System.out.print(head.data + " ");
            head = head.nextnd;
        } while (head != null);
        System.out.println();
    }
    public void operate_stack(){
        int ch = 1 ;
        stack_implementation_LinkedList ob = new stack_implementation_LinkedList() ;
        while(true){
            System.out.println("Enter your choice for the desired stack operation: 1: For Element insertion , 2: For Element Deletion, 3: Peek Operation, 4: To Display the stack and any other input to exit.");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the element you want to insert.");
                int num = sc.nextInt() ;
                ob.insertion_operation(num);
            } else if (ch == 2) {
                int p = ob.pop() ;
                if(p == -1)
                    System.out.println("No Element inside the array.");
                else
                    System.out.println("The Popped element is: " + p);
            } else if (ch == 3) {
                ob.peek();
            } else if (ch == 4) {
                ob.display_stack();
            } else
                break ;
        }
    }
}
public class Stack_implementation {
    public static void main(String[] args) {
        stack_implementation_array ob = new stack_implementation_array() ;
        stack_implementation_ArrayList ob2 = new stack_implementation_ArrayList() ;
        stack_implementation_LinkedList ob3 = new stack_implementation_LinkedList() ;
//        ob.operate_stack();
        ob3.operate_stack();
    }
}
