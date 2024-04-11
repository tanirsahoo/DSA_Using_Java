import java.util.Scanner;

class heap_sort_algorithm{
    public int[] heapify(int[] ar, int index , int size){
        int left_child = 2 * index ;
        int right_child = 2 * index + 1 ;
        int larger_index = ar[left_child] > ar[right_child] ? (2 * index) : (2 * index + 1) ;
        while((left_child <= size || right_child <= size) && (ar[larger_index] > ar[index])){
            int swap_var = ar[larger_index] ;
            ar[larger_index] = ar[index] ;
            ar[index] = swap_var ;
            index = larger_index ;
            left_child = 2 * index ;
            right_child = 2 * index + 1 ;
            larger_index = ar[left_child] > ar[right_child] ? (2 * index) : (2 * index + 1) ;
        }
        return ar ;
    }
//    public int heapsort(int[] ar){
//
//    }
}

public class heap_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have inside the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n + 1] ;
        ar[0] = -1 ;
        for(int i = 1 ; i <= n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        heap_sort_algorithm ob = new heap_sort_algorithm() ;
        for(int i = (int)(Math.floor(n / 2)) ; i >= 1 ; i --){
            ar = ob.heapify(ar , i , n) ;
        }
        for(int i = 1 ; i <= n ; i ++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
