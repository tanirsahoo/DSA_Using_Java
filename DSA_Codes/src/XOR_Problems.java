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
        operations ob = new operations(arr) ;
        ob.one_non_repeating(arr);
    }
}
