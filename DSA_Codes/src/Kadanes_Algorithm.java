/*
Largest Sum Contiguous Subarray problem statement states that we need to find a subarray from a given array which has the maximum sum.
For Example {-5 , 4 , 6 , -3 , 4 , -1}
The Solution is: {4 , 6 , -3 , 4}
Sum is : 11
*/
package DSA_Codes.src;

import java.util.Scanner;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have inside the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for (int i = 0 ; i < n ; i ++) {
            System.out.println("Enter the element at index: " + i);
            ar[i] = sc.nextInt() ;
        }
        //-----------Kadane's Algorithm------------
//        int maxsum = 0 , cursum = 0 ;
//        for(int i = 0 ; i < n ; i ++){
//            cursum = cursum + ar[i] ;
//            if(cursum > maxsum)
//                maxsum = cursum ;
//            if(cursum < 0)
//                cursum = 0 ;
//        }

        //---------------Tackling with array with only neagtive numbers-------------------

        int maxsum = Integer.MIN_VALUE , cursum = 0 ;
        for(int i = 0 ; i < n ; i ++){
            if(cursum < 0)
                cursum = ar[i] ;
            else
                cursum = cursum + ar[i] ;
            if(cursum > maxsum)
                maxsum = cursum ;
        }
        System.out.println("The Maximum Sum is: " + maxsum);
    }
}
