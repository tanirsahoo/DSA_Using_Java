package DSA_Codes.src;

import java.util.Scanner;

class sort_algorithm{
    public int[] selection_algo(int ar[]){
        int len = ar.length ;
        for(int i = 0 ; i < len - 1 ; i ++){
            int min = i ;
            for(int j = i + 1 ; j < len ; j ++){
                if(ar[j] < ar[min])
                    min = j ;
            }
            if(min != i){
                int swp = ar[i] ;
                ar[i] = ar[min] ;
                ar[min] = swp ;
            }
        }
        return ar ;
    }
}

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have inside the array");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        sort_algorithm ob = new sort_algorithm() ;
        ar = ob.selection_algo(ar) ;
        for(int i = 0 ; i < n ; i ++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
}
