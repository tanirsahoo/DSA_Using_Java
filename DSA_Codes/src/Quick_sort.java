package DSA_Codes.src;

import java.util.Scanner;

class quick_sort_algo{
    public int index_swap(int ar[] , int f , int l){
        int pivot = ar[f] ;
        int m = f , n = l ;
        while(m < n){
            if(ar[m] <= pivot){
                m ++ ;
            }
            else if(ar[n] > pivot){
                n -- ;
            }
            else{
                int swp = ar[m] ;
                ar[m] = ar[n] ;
                ar[n] = swp ;
            }
        }
        if(m < n) {
            ar[f] = ar[m];
            ar[m] = pivot;
        }
        if(m == n){
            m -- ;
            ar[f] = ar[m];
            ar[m] = pivot;
        }
        return m ;
    }
    public int[] sorting_algo(int ar[] , int l , int h){
        if(l < h){
            int pivot = index_swap(ar , l , h) ;
            ar = sorting_algo(ar , l , pivot - 1) ;
            ar = sorting_algo(ar , pivot + 1 , h) ;
        }
        return ar ;
    }
}

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have in the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        quick_sort_algo ob = new quick_sort_algo() ;
        ar = ob.sorting_algo(ar , 0 , n - 1) ;
        for(int i = 0 ; i < n ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
}
