import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int a = 2 , b = 9 ;
//        System.out.println("Enter the value of a : ");
//        a = sc.nextInt() ;
//        System.out.println("Enter the value of b : ");
//        b = sc.nextInt() ;
        System.out.println("'&' AND operation on the variable a and b is: " + (a & b));
        System.out.println("'|' OR operation on the variable a and b is: " + (a | b));
        System.out.println("'^' XOR operation on the variable a and b is: " + (a ^ b));
        System.out.println("'~' NOT operation on the variable a and b is: " + (~a) + " and " + (~b));
        System.out.println("'>>' RIGHT SHIFT operation on the variable a and b. For a: " + (a >> 2) + " -->  In this case we shifted the bits of variable a 2 times to right. Similarly for b: " + (b >> 2));
        System.out.println("'<<' RIGHT SHIFT operation on the variable a and b. For a: " + (a << 2) + " -->  In this case we shifted the bits of variable a 2 times to left. Similarly for b: " + (b << 2));
    }
}
