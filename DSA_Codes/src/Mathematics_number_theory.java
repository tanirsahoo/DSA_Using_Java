//Things we are going to compute in this code:
//        1: Factorial of a number
//        2: Trailing zeros of a number.(The number of zeros present in the end of the factorial of a number.)
//        3: Palindrome Number


/*
Logic for finding the trailing zeros: For any given number we need to find the pair of 2s and 5s in that number.
Now there is a pattern for finding the number of 5s in the factorial of that number.5 occurs after every 5th position
and the number of appearance of 5 is always less than the number of appearance of 2s. Therefore we need to divide the number
with 5. The modulus of the division is the number of trailing zeros in the given factorial.

Now here is a twist, if the value of n is greater than or equal to 25 then for 25 we have 5x5, therefore two 5s in a row,
to handle this scenario we need to use the formulae |n/5| + |n/25| + |n/125| + |n/625| + .....(The terms would be used depending on the value of n)
*/

package DSA_Codes.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class trailing_zeros{
    int n ;
    trailing_zeros(int number){
        this.n = number ;
    }
    void num_of_zeros(){
        int s = 0 ;
        for(int i = 5 ; i <= n ; i = i*5){
            s = s + (n/i) ;
        }
        System.out.println("Number of trailing zeros are: " + s);
    }
    double factorial_find(int p){
        if(p == 0)
            return 1 ;
        else if(p == 1)
            return 1 ;
        else
            return (p * factorial_find(p - 1)) ;
    }
}
public class Mathematics_number_theory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the trailing zeros of:");
        int n = sc.nextInt();
        trailing_zeros ob = new trailing_zeros(n);
        ob.num_of_zeros();
        System.out.println("The factorial of " + n + " is: " + ob.factorial_find(n));
    }
}
