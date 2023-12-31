package DSA_Codes.src;

import java.util.Arrays;
import java.util.Scanner;

class bubble_sorting_algorithm{
    public int[] sorting_algo(int ar[]){
        for(int i = 0 ; i < ar.length - 1 ; i ++){
            for(int j = 0 ; j < ar.length - i - 1 ; j ++){
                if(ar[j] > ar[j+1]){
                    int swp = ar[j] ;
                    ar[j] = ar[j+1] ;
                    ar[j+1] = swp ;
                }
            }
        }
        return ar ;
    }
}
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have in the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        bubble_sorting_algorithm ob = new bubble_sorting_algorithm() ;
        ar = ob.sorting_algo(ar) ;
        System.out.print("The Sorted array is: ");
        for(int i = 0 ; i < n ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
}
