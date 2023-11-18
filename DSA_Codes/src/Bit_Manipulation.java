import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int a , b ;
        System.out.println("Enter the value of a : ");
        a = sc.nextInt() ;
        System.out.println("Enter the value of b : ");
        b = sc.nextInt() ;
        System.out.println("'&' operation on the variable a and b is: " + (a & b));
        System.out.println("'|' operation on the variable a and b is: " + (a | b));
        System.out.println("'^' operation on the variable a and b is: " + (a ^ b));
    }
}
