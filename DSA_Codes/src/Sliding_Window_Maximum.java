import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {
    private static int[] sliding_algo_max_find(int[] ar , int win)throws NullPointerException{
//        int max = Integer.MIN_VALUE ;
        int arr[] = new int[ar.length - win + 1] ;
        ArrayDeque<Integer> deq = new ArrayDeque<>() ;
        ArrayDeque<Integer> de = new ArrayDeque<>() ;
//        de.offer(Integer.MIN_VALUE);
//        deq.offer(Integer.MIN_VALUE);
        deq.offerFirst(Integer.MIN_VALUE) ;
        de.offerFirst(Integer.MIN_VALUE) ;
        int j = 0 ;
        for(int i = 0 ; i < win ; i ++){
            try {
                while (deq.peekFirst() < ar[i]) {
                    deq.pollFirst();
                    de.pollFirst();
                }
            }catch(Exception e){}
            deq.offerFirst(ar[i]);
            de.offerFirst(i) ;
        }
        arr[j ++] = deq.peekLast() ;
        for(int i = win ; i < ar.length ; i ++){
            while(de.peekLast() < (i - win + 1)){
                de.pollLast() ;
                deq.pollLast();
            }
            try {
                while (deq.peekFirst() < ar[i]) {
                    deq.pollFirst();
                    de.pollFirst();
                }
            }catch(Exception e){}
            deq.offerFirst(ar[i]);
            de.offerFirst(i) ;
            arr[j ++] = deq.peekLast() ;
        }
        return arr ;
    }
    public static void main(String[] args) {
        int[] ar = {4 , 1 , 3 , 5 , 1 , 2 , 3 , 2 , 1 , 1 , 5} ;
        int window_size = 3 ;
        int[] arr = sliding_algo_max_find(ar , 3) ;
        for(int i = 0 ; i < ar.length ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
