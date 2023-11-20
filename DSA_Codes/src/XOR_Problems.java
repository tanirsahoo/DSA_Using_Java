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
    void one_non_repeating(int[] ar){ // Solution to Question Number 1.
        int v = 0 ;
        for(int i = 0 ; i < ar.length ; i ++)
            v = v ^ ar[i] ;
        System.out.println("The only non-repeating element inside the array is: " + v);
    }

    void two_non_repeating(int[] ar){ // Solution to Question Number 2.
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
    void one_non_repeating_present_thrice(int[] ar , int num_rep){ // Solution to Question Number 3.
        byte size_int = 4 ;
        int int_size = 8 * size_int ;
        int count[] = new int[int_size] ;

        for(int i = 0 ; i < int_size ; i ++){
            for(int j = 0 ; j < ar.length ; j ++){
                if((ar[j] & (1 << i)) != 0)
                    count[i] += 1 ;
            }
        }
        int res = 0 ;
        for(int i = 0 ; i < int_size ; i ++){
            res = res + ((count[i] % num_rep) * (1 << i)) ;
        }
        res = res / (ar.length % num_rep) ;
        System.out.println("The Unique element is: " + res);
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
//        int arr[] = {6, 2, 5, 2, 2, 6, 6} ;
        operations ob = new operations(arr) ;
        System.out.println("Enter your choice:\n1.Solution to Question 1\n2.Solution to Question 2\n3.Solution to Question 3");
        int ch = sc.nextInt() ;
        if(ch == 1)
            ob.one_non_repeating(arr) ;
        else if(ch == 2)
            ob.two_non_repeating(arr);
        else if(ch == 3)
            ob.one_non_repeating_present_thrice(arr , 3);
        else
            System.out.println("Wrong Choice.");
    }
}