/*
This code deals with the logics for 1.Euclid GCD, 2. Prime Number, 3. Sieve of Eratosthenes
1. Prime Number --> Logic: We need to check whether there is any factorial of that number from 1 to sq.root(n).
   If there is root present, then it is not a prime number, otherwise it is a prime number.
   Time complexity: O(sq.root(n))
2. Euclid GCD --> Logic:
3. Sieve of Erastosthenes --> Logic: Find the prime numbers present in a series of given numbers. For example user has entered
   the value of n as 12, therefore we need to check how many prime numbers are there between 1 to 12. This can be performed by a very simple logic.
   First we need to create a boolean array of the same size as the number of inputs and mark every item as true. Now we need to run the loop for 1 to sq.root(n). and mark every item in the array as false
   which is a multiple of i, where i is for(int i = 0 ; i < sq.root(n) ; i ++).

*/

package DSA_Codes.src;

import java.util.Scanner;

class Sieve_of_Eratosthenes{

}

public class Euclid_GCD_Prime_Numbers_Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Hello World");
    }
}
