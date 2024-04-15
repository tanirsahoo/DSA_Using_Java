import java.util.PriorityQueue;
import java.util.Scanner;

public class Connecting_n_ropes {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of ropes you want to have in the bucket.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        int cost = 0 ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the size of the rope at index: " + (i + 1));
            ar[i] = sc.nextInt() ;
        }
        for (int items:ar){
            priorityqueue.add(items) ;
        }
        while(priorityqueue.size() != 1){
            int new_item = priorityqueue.poll() + priorityqueue.poll() ;
            cost = cost + new_item ;
            priorityqueue.add(new_item) ;
        }
        System.out.println("The Minimum cost to connect n-ropes is: " + cost);
    }
}
