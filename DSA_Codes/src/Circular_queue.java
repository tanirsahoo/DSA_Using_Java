import java.util.Scanner;

public class Circular_queue {
    static int front = 0 , rear = -1 ;
    private static boolean isempty(){
        if(front == 0 && rear == -1)
            return true ;
        else
            return false ;
    }
    private static boolean isfull(int length){
        if(isempty()){
            return false ;
        }
        else {
            return ((rear + 1) % length) == front;
        }
    }
    private static void enqueue(int[] ar, int n){
        if(isfull(ar.length)){
            System.out.println("No More space to enter new element.");
        }
        else{
            rear = (rear + 1) % ar.length ;
            ar[rear] = n ;
        }
    }
    private static int dequeue(int[] ar) {
        if (isempty()) {
            System.out.println("Element not found.");
            return Integer.MIN_VALUE ;
        } else{
            int index = front ;
            front = (front + 1) % ar.length;
            if (((rear + 1) % ar.length - front) == 0) {
                front = 0;
                rear = -1;
            }
            return ar[index] ;
        }
    }
    private static void display(int[] ar){
        if(isempty()){
            System.out.println("The Array is Empty.");
        }
        else {
            if (rear >= front) {
                System.out.print("| ");
                for (int i = front; i <= rear; i++)
                    System.out.print(ar[i] + " ");
                System.out.println();
            } else {
                for (int i = 0; i <= rear; i++)
                    System.out.print(ar[i] + " ");
                System.out.print(" | ");
                for (int i = front; i < ar.length; i++)
                    System.out.print(ar[i] + " ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> ar = new ArrayList<>();
        int[] ar = new int[4] ;
        int ch ;
        Scanner sc = new Scanner(System.in) ;
        while(true){
            System.out.println("Enter: 1 for Enqueue , 2 for Dequeue, 3 to display the queue and 4 to exit the loop.");
            ch = sc.nextInt() ;
            if(ch == 1){
                System.out.println("Enter the number you want to insert inside the queue.");
                int num = sc.nextInt() ;
                enqueue(ar , num);
            }
            else if(ch == 2){
                int del = dequeue(ar);
                if(del == Integer.MIN_VALUE){
                    continue ;
                }
                else {
                    System.out.println("The deleted element is: " + del);
                }
            }
            else if(ch == 3){
                display(ar) ;
            }
            else if(ch == 4){
                break ;
            }
            else{
                System.out.println("Wrong Choice, please enter again.");
            }
        }
    }
}
