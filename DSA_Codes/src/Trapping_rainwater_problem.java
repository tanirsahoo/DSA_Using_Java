/*
Problem: In Trapping rainwater problem you would be provided with an array containing the height of certain buildings and you need to figure out the quantity of water that would get collected inside the vacant blocks.
*/
package DSA_Codes.src;

import java.util.Scanner;

public class Trapping_rainwater_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array you want to insert.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        int left[] = new int[n] ;
        int right[] = new int[n] ;
        int len = ar.length ;
        left[0] = ar[0] ;
        for(int i = 1 ; i < n ; i ++){
            left[i] = Math.max(left[i-1] , ar[i]) ;
        }
        right[n-1] = ar[n-1] ;
        for(int i = n-2 ; i >= 0 ; i --){
            right[i] = Math.max(right[i+1] , ar[i]) ;
        }
        int ans = 0 ;
        for(int i = 0 ; i < n ; i ++){
            ans += Math.min(left[i] , right[i]) - ar[i] ;
        }
        System.out.println("The Sum of the total collected water is: " + ans);
    }
}
