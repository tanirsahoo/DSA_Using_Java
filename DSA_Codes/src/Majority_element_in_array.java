/*
The problem is, there is a given array containing elements. You need to find the element that has maximum appearance in the array.
The most efficient way of solving this problem is by using Moore's voting algorithm which solves this problem in O(N)-Time Complexity and O(1)-Space Complexity
*/
package DSA_Codes.src;

import java.util.Scanner;

public class Majority_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have in the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        int start_index = 0 ;
        int cnt = 1 ;
        for(int i = 0 ; i < n ; i ++){
            
        }
    }
}
