//Applying heap sort algorithm to sort an array in ascending order

import java.util.Scanner;

class heap_sort_algorithm{
    public int[] heapify(int[] ar, int index , int size){
        int left_child = 2 * index ;
        int right_child = 2 * index + 1 ;
        if(left_child <= size && right_child <= size){
            int larger_index = ar[left_child] > ar[right_child] ? (2 * index) : (2 * index + 1) ;
            if(ar[index] < ar[larger_index]) {
                int swap_var = ar[larger_index];
                ar[larger_index] = ar[index];
                ar[index] = swap_var;
                return heapify(ar, larger_index, size);
            }
            else{
                return ar ;
            }
        }
        else if(left_child <= size){
            if(ar[index] < ar[left_child]) {
                int swap_var = ar[left_child];
                ar[left_child] = ar[index];
                ar[index] = swap_var;
                return heapify(ar, left_child, size);
            }
            else{
                return ar ;
            }
        }
        else{
            return ar ;
        }
    }
    public int[] heapsort(int[] ar , int n){
        for(int i = (int)(Math.floor(n / 2)) ; i >= 1 ; i --){
            ar = heapify(ar , i , n) ;
        }
        int num = n ;
        for(int i = n ; i > 0 ; i --){
            int swapvar = ar[i] ;
            ar[i] = ar[1] ;
            ar[1] = swapvar ;
            ar = heapify(ar , 1 , -- num) ;
        }
        return ar ;
    }
    public void display(int[] ar , int n){
        for(int i = 0 ; i <= n ; i ++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
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
        ar = ob.heapsort(ar , n) ;
        ob.display(ar , n);
    }
}
