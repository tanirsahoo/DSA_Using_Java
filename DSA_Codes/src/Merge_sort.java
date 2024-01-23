package DSA_Codes.src;

import java.util.Scanner;

class merge_algo{
    public void sorting_algo(int ar[] , int f , int l){
        if(f < l) {
            int mid = (f + l) / 2;
            sorting_algo(ar , f , mid);
            sorting_algo(ar , mid + 1 , l);
            merge(ar , f , mid , l) ;
        }
    }
    public void merge(int ar[] , int f , int mid , int l){
        int[] b = new int[l+1] ;
        int k = f , g = f ;
        int p = mid + 1 ;
        while(k <= mid && p <= l){
            if(ar[k] > ar[p]){
                b[g] = ar[p] ;
                p ++ ;
            }
            else if(ar[k] < ar[p]){
                b[g] = ar[k] ;
                k ++ ;
            }
            else{
                b[g] = ar[p] ;
                p ++ ;
            }
            g ++ ;
        }
        while(k <= mid)
            b[g ++] = ar[k ++] ;
        while(p <= l)
            b[g ++] = ar[p ++] ;
        for(int i = f ; i <= l ; i ++){
            ar[i] = b[i] ;
        }
    }
}

public class Merge_sort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
//    System.out.println("Enter the number of elements you want to have in the array.");
//    int n = sc.nextInt() ;
//    int[] ar = new int[n] ;
//    for(int i = 0 ; i < n ; i ++){
//        System.out.println("Enter the element at index: " + i);
//        ar[i] = sc.nextInt() ;
//    }
        int[] ar = {2 , 5 , 3 , 9 , 7 , 1 , 3 , 2} ;
        int n = ar.length ;
    merge_algo ob = new merge_algo() ;
    ob.sorting_algo(ar , 0 , n - 1) ;
    for(int i = 0 ; i < n ; i ++)
        System.out.print(ar[i] + " ");
    System.out.println();
    }
}
