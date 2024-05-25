import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class queue_using_stack{
    private static void push_stack(Stack<Integer> st1 , int n){
        try{
            st1.push(n) ;
        }catch(Exception e){
            System.out.println("Some Exception might have occured");
        }
    }
    private static void pop_stack(Stack<Integer> st1 , Stack<Integer> st2){
        try {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            System.out.println("The Removed element is: " + st2.pop());
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
        }catch(Exception e){
            System.out.println("Some Exception might have occured.");
        }
    }
    private static void display(Stack<Integer> st1 , Stack<Integer> st2){
        while(!st1.empty()){
            st2.push(st1.pop()) ;
        }
        while(!st2.empty()){
            System.out.print(st2.peek() + " ");
            st1.push(st2.pop()) ;
        }
        System.out.println();
    }
    public void implementation(){
        Stack<Integer> st1 = new Stack<>() ;
        Stack<Integer> st2 = new Stack<>() ;
        int ch ;
        Scanner sc = new Scanner(System.in) ;
        while(true){
            System.out.println("Enter 1: Enqueue , 2: Dequeue , 3: Display the queue, 4: Exit");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the element you want to insert inside the queue.");
                int n = sc.nextInt() ;
                push_stack(st1 , n);
            }
            else if(ch == 2){
                pop_stack(st1 , st2);
            }
            else if(ch == 3){
                display(st1 , st2);
            }
            else if(ch == 4){
                break ;
            }
            else{
                System.out.println("You have entered a wrong choice.");
            }
        }
    }
}

class stack_using_queue{
    private static void push_queue(Queue<Integer> q1 , Queue<Integer> q2 , int n){
        try {
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
            q1.offer(n);
            while (!q2.isEmpty()) {
                q1.offer(q2.poll());
            }
        }catch(Exception e){
            System.out.println("Some Exception might have occured.");
        }
    }
    private static void pop_queue(Queue<Integer> q1){
        try {
            System.out.println("The removed element is: " + q1.poll());
        }catch(Exception e){
            System.out.println("Some Exception might have occured.");
        }
    }
    private void display(Queue<Integer> q1 , Queue<Integer> q2){
        try {
            while (!q1.isEmpty()) {
                System.out.print(q1.peek() + " ");
                q2.offer(q1.poll());
            }
            System.out.println();
            while (!q2.isEmpty()) {
                q1.offer(q2.poll());
            }
        }catch(Exception e){
            System.out.println("Some Exception might have occured.");
        }
    }
    public void implementation(){
        Queue<Integer> q1 = new ArrayDeque<>() ;
        Queue<Integer> q2 = new ArrayDeque<>() ;
        int ch ;
        Scanner sc = new Scanner(System.in) ;
        while(true){
            System.out.println("Enter 1: Push , 2: Pop , 3: Display the Stack, 4: Exit");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the element you want to insert inside the Stack.");
                int n = sc.nextInt() ;
                push_queue(q1 , q2 , n);
            }
            else if(ch == 2){
                pop_queue(q1);
            }
            else if(ch == 3){
                display(q1 , q2);
            }
            else if(ch == 4){
                break ;
            }
            else{
                System.out.println("You have entered a wrong choice.");
            }
        }
    }
}

public class Queue_using_stack_and_stack_using_queue {
    public static void main(String[] args) {
        queue_using_stack ob = new queue_using_stack() ;
        ob.implementation();
        stack_using_queue ob2 = new stack_using_queue() ;
        ob2.implementation();
    }
}
