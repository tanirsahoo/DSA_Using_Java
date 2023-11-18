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
        if(find(0) == 1){
            int k1 = 0 , k2 = 0 ;
            for(int i = 0 ; i < ar.length ; i ++)
            {
                if(find(i) == 0)
                    k1 = k1 ^ ar[i] ;
                if(find(i) == 1)
                    k2 = k2 ^ ar[i] ;
            }
            System.out.println("The two numbers are: " + k1 + " and " + k2);
        }
        else{

        }
    }
    int find(int n){ // Find the n th bit in the given number a
        int k = 1 << n ; // We are shifting the value by n bits and creating a mask and then performing and operation to check whether the bit present at i'th position in the original number is 1 or 0.
        if((a & k) > 0)
            return 1 ;
        else
            return 0 ;
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
