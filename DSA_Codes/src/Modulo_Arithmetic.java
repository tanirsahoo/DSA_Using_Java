/*
We need to find a^b%n sp that we could store larger numbers.
Now % operator has some operations:
(a/b)%n = (a%n / b%n)%n
(a+b)%n = (a%n + b%n)%n
(a*b)%n = (a%n * b%n)%n
(a-b)%n = (a%n - b%n)%n
*/

package DSA_Codes.src;

import java.util.Scanner;

class modulo_operation {
    public int modulus(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a ;
            }
            a = a * a ;
            b = b >> 1 ;
        }
        return res ;
    }
    public long modulus_arithmetic(long a, long b , int n) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * (a%n))%n ;
            }
            a = (a%n * a%n)%n ;
            b = b >> 1 ;
        }
        return res ;
    }
}
public class Modulo_Arithmetic {
    public static void main(String[] args) {
        modulo_operation ob = new modulo_operation() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number.");
//        int a = sc.nextInt() ;
        long a = sc.nextLong() ;
        System.out.println("Enter the power.");
//        int b = sc.nextInt() ;
        long b = sc.nextLong() ;
        System.out.println("Enter the value of mod.");
        int n = sc.nextInt() ;
//        int result = ob.modulus(a , b) ;
//        System.out.println("a to the power b is: " + result);
        System.out.println("a to the power b mod n is: " + ob.modulus_arithmetic(a , b , n));
    }
}
