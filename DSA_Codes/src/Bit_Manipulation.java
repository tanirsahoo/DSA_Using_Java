import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

class Even_Odd{
    int a , b ;
    Even_Odd(int a_val , int b_val){
        a = a_val ;
        b = b_val ;
    }
    void check(int a , int b){
//        Here we have used the concept of Bit Masking to check whether the given number is even or odd.
        if(((a & 1) == 1) && ((b & 1) == 1))
            System.out.println("Both the numbers are Odd.") ;
        else if(((a & 1) == 1) && ((b & 1) == 0))
            System.out.println("a is odd but b is even") ;
        else if(((a & 1) == 0) && ((b & 1) == 1))
            System.out.println("a is even but b is odd") ;
        else
            System.out.println("Both the numbers are even") ;
    }
}


class Swap_using_Bit{
    int a , b ;
    Swap_using_Bit(int p , int q){
        a = p ;
        b = q ;
    }
    void swap(int p , int q){
        p = p ^ q ;
        q = p ^ q ;
        p = p ^ q ;
        System.out.println("Value of X and Y are: " + p + " and " + q) ;
    }
}

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

        System.out.println("Let's check whether a given number is even or odd using right and left shift operations.");
        int x , y ;
        System.out.println("Enter the value of X: ");
        x = sc.nextInt() ;
        System.out.println("Enter the value of Y: ");
        y = sc.nextInt() ;
        Even_Odd ob = new Even_Odd(x , y) ;
        ob.check(x , y) ;

        System.out.println("Let's swap two numbers using bitwise operators : '^'.(XOR)");
        int p , q ;
        System.out.println("Enter the first value (X): ");
        p  = sc.nextInt() ;
        System.out.println("Enter the second value (Y): ") ;
        q = sc.nextInt() ;
        Swap_using_Bit ob2 = new Swap_using_Bit(p , q) ;
        ob2.swap(p , q) ;
    }
}
