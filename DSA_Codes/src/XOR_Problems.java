import java.util.Scanner ;

/**
 * Questions;
 * 1. Find the only non-repeating element in an array where every element repeats twice.
 * 2. Find the two non-repeating element in an array where every element repeats twice.
 * 3. Find the only non-repeating element in an array where every element repeats thrice.
 */

class operations{
    int ar[] ;
    operations(int[] p){
            this.ar = p;
    }
    void one_non_repeating(int[] ar){
        int v = 0 ;
        for(int i = 0 ; i < ar.length ; i ++)
            v = v ^ ar[i] ;
        System.out.println("The only non-repeating element inside the array is: " + v);
    }

    void two_non_repeating(int[] ar){
        int v = 0 ;
        for(int i = 0 ; i < ar.length ; i ++)
            v = v ^ ar[i] ;
        decimalToBinary(v);
        v = v & -v ;
        decimalToBinary(v);
        int k1 = 0 , k2 = 0 ;
            for(int i = 0 ; i < ar.length ; i ++)
            {
                if((ar[i] & v) > 0) {
                    k1 = k1 ^ ar[i];
                    System.out.print("The Value of K1: ");
                    decimalToBinary(k1);
                    System.out.println();
                }
                else {
                    k2 = k2 ^ ar[i];
                    System.out.print("The Value of K2: ");
                    decimalToBinary(k2);
                    System.out.println();
                }
            }
            System.out.println("The two numbers are: " + k1 + " and " + k2) ;
    }
    void decimalToBinary(int n) {
        if (n < 0) {
            System.out.println("Error: n must be a non-negative integer");
            return;
        }
        String binary = "";
        while (n > 0) {
            binary = binary + n % 2;
            n /= 2;
        }
        binary = new StringBuilder(binary).reverse().toString();
        System.out.println(binary);
    }
}

public class XOR_Problems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int size ;
        System.out.println("Enter the size of the array.");
        size = sc.nextInt() ;
        int arr[] = new int[size] ;
        for(int i = 0 ; i < size ; i ++){
            System.out.println("Enter the element at index: " + i);
            arr[i] = sc.nextInt() ;
        }
//        int arr[] = {7 , 9 , 8 , 2 , 9 , 7 , 4 , 8} ;
        operations ob = new operations(arr) ;
        ob.one_non_repeating(arr) ;
        ob.two_non_repeating(arr);
    }
}
