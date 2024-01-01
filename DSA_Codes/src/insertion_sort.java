package DSA_Codes.src;

import java.util.Scanner;

class sorting_algo{
    public int[] insertion_algo(int ar[]){
        int len = ar.length , j ;
        for(int i = 1 ; i < len ; i ++){
            int temp = ar[i] ;
            j = i - 1 ;
            while(j >= 0 && ar[j] > temp) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = temp ;
        }
        return ar ;
    }
}

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have inside the array");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        sorting_algo ob = new sorting_algo() ;
        ar = ob.insertion_algo(ar) ;
        for(int i = 0 ; i < n ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
}
