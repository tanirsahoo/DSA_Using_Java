package DSA_Codes.src;

import java.util.Scanner;

class merge_algo{
}

public class Merge_sort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the number of elements you want to have in the array.");
    int n = sc.nextInt() ;
    int[] ar = new int[n] ;
    for(int i = 0 ; i < n ; i ++){
        System.out.println("Enter the element at index: " + i);
        ar[i] = sc.nextInt() ;
    }
    merge_algo ob = new merge_algo() ;
    ar = ob.sorting_algo(ar , 0 , n - 1) ;
    for(int i = 0 ; i < n ; i ++)
        System.out.print(ar[i] + " ");
    System.out.println();
    }
}
