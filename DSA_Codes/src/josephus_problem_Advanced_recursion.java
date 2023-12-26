/*
1. Number of ways problem statement: states that we have a given n x m matrix, now we need to find the number of ways one can reach the bottom right corner of the matrix if he starts from top left.
   For a given n x m matrix, we can find the number of ways by calculating f(n-1 , m) + f(n , m-1).
2. Josephus Problem: Josephus problem states that there are n number of people, they all are standing in a circular fashion. The rule states that the 0th person will have a gun and he can shoot the persion standing at k-1 th position
   (depending on the value of k). After he shoots, the gun moves to the kth person. The loop continues until only one person survives and becomes the winner.
   Solution: We need to imagine there are two circles, or two loops in which the people were standing. Now after one person gets killed and the gun is transferred to the next person we need to state his index as zero and change the index of others accordingly.
   The solution for this problem statement is: f(n , k) = (f(n-1 , k) + k) % n
*/
package DSA_Codes.src;

import java.util.Scanner;

class josephus_solution{
    public int number_of_ways(int n , int m){
        if(n == 1 || m == 1)
            return 1 ;
        else
            return number_of_ways(n-1 , m) + number_of_ways(n , m-1) ;
    }
    public int josephus_problem(int n , int k){
        if(n == 1)
            return 0 ;
        else
            return (josephus_problem(n - 1 , k) + k) % n ;
    }
}

public class josephus_problem_Advanced_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n");
        int n = sc.nextInt() ;
//        System.out.println("Enter the value of m");
//        int m = sc.nextInt() ;
        josephus_solution ob = new josephus_solution() ;
//        int result = ob.number_of_ways(n , m) ;
//        System.out.println("The number of ways one can reach from top left corner to bottom right corner is: " + result);
        System.out.println("Enter the value of k.");
        int k = sc.nextInt() ;
        System.out.println("The solution to josephus problem is: " + ob.josephus_problem(n , k));
    }
}
