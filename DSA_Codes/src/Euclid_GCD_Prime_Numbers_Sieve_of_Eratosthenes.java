/*
This code deals with the logics for 1.Euclid GCD, 2. Prime Number, 3. Sieve of Eratosthenes
1. Prime Number --> Logic: We need to check whether there is any factorial of that number from 1 to sq.root(n).
   If there is root present, then it is not a prime number, otherwise it is a prime number.
   Time complexity: O(sq.root(n))
2. Euclid GCD --> Logic: return calculate_GCD(b , a%b) ;
3. Sieve of Erastosthenes --> Logic: Find the prime numbers present in a series of given numbers. For example user has entered
   the value of n as 12, therefore we need to check how many prime numbers are there between 1 to 12. This can be performed by a very simple logic.
   First we need to create a boolean array of the same size as the number of inputs and mark every item as true. Now we need to run the loop for 1 to sq.root(n). and mark every item in the array as false
   which is a multiple of i, where i is for(int i = 0 ; i < sq.root(n) ; i ++). At last we would be geeting a list of all prime numbers.
*/

package DSA_Codes.src;

import java.util.Arrays;
import java.util.Scanner;

class Sieve_of_Eratosthenes{
    static boolean[] primelist(int n){
        boolean[] arraylist = new boolean[n + 1] ;
        Arrays.fill(arraylist , true); // Arrays.fill(<array_name> , <value you want to assign>) is an inbuild function of util.Arrays class that is used to assign every element inside the array with certain value.
        arraylist[0] = false ;
        arraylist[1] = false ;
        for(int i = 2 ; i * i <= n ; i ++){
            for(int j = 2*i ; j <= n ; j += i){
                arraylist[j] = false ;
            }
        }
        return arraylist ;
    }
}

class GCD{
    int calculate_gcd(int a , int b){
        if(b == 0)
            return a ;
        else
            return calculate_gcd(b , a%b) ;
    }
}

public class Euclid_GCD_Prime_Numbers_Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of terms");
        int n = sc.nextInt() ;
        Sieve_of_Eratosthenes ob = new Sieve_of_Eratosthenes() ;
        boolean ar[] = ob.primelist(n) ;
        int i = 0 ;
        for (boolean item: ar) {
            System.out.println(i + " is Prime Number: " + item);
            i ++ ;
        }
        GCD ob2 = new GCD() ;
        System.out.println("Enter the first term for GCD calculation");
        int a1 = sc.nextInt() ;
        System.out.println("Enter the second term for GCD calculation");
        int a2 = sc.nextInt() ;
        int result = ob2.calculate_gcd(a1 , a2);
        System.out.println("The resultant value is: " + result);
    }
}
