/*
In this question we have performed 3 operations:
1. Count Distict elements in an array.
2. Union of two arrays.
3. Intersection of two arrays.
All the above operations have been performed using set and hashset library of java.
 */


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
    public int merge_arrays(int[] a , int[] b){
        Set<Integer> set2 = new HashSet<>() ;
        for(int item1:a){
            set2.add(item1) ;
        }
        for(int item2:b){
            set2.add(item2) ;
        }
        return set2.size() ;
    }
    public int intersection_of_two_array(int[] a , int[] b){
        Set<Integer> set = new HashSet<>() ;
        int count = 0 ;
        for(int items:a){
            set.add(items) ;
        }
        for(int items:b){
            if(set.contains(items)){
                count ++ ;
                set.remove(items) ;
            }
        }
        return count ;
    }
}

public class Hashing_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the Size of the array you want to have.");
//        int n = sc.nextInt() ;
//        int[] ar = new int[n] ;
//        for(int i = 0 ; i < n ; i ++){
//            System.out.println("Enter the element at index: " + (i + 1));
//            ar[i] = sc.nextInt() ;
//        }
        System.out.println("Enter the size of the first array.");
        int n1 = sc.nextInt() ;
        System.out.println("Enter the size of the second array.");
        int n2 = sc.nextInt() ;
        int[] ar1 = new int[n1] ;
        int[] ar2 = new int[n2] ;
        for(int i = 0 ; i < n1 ; i ++){
            ar1[i] = sc.nextInt() ;
        }
        for(int j = 0 ; j < n2 ; j ++){
            ar2[j] = sc.nextInt() ;
        }
        hashing_function ob = new hashing_function() ;
        int unique_elem = ob.merge_arrays(ar1 , ar2) ;
        System.out.println("The Number of distict elements in the array are: " + unique_elem);
    }
}
