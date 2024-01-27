import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class hashing_function {
    public int count_Distict(int[] ar) {
        Set<Integer> set = new HashSet<>() ;
        for(int item:ar){
            set.add(item) ;
        }
        return set.size() ;
    }
}

public class Hashing_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Size of the array you want to have.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the element at index: " + (i + 1));
            ar[i] = sc.nextInt() ;
        }
        hashing_function ob = new hashing_function() ;
        int unique_elem = ob.count_Distict(ar) ;
        System.out.println("The Number of distict elements in the array are: " + unique_elem);
    }
}
