/*
In this program we are going to find the number of pages one should allocate to a student to read so that its value stays minimum for the overall operation.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner ;

class min_range{
    public int minpages(int ar[] , int k){
        int[] b = ar ;
        Arrays.sort(b) ;
        int min = b[b.length - 1] ;
        int max = 0 , res =  0;
        for(int i = 0 ; i < b.length ; i ++){
            max += b[i] ;
        }
        while(min <= max){
            int mid = (min + max) / 2 ;
            if(isfeasible(ar , k , mid)){
                res = mid ;
                max = mid - 1 ;
            }
            else{
                min = mid + 1 ;
            }
        }
        return res ;
    }
    boolean isfeasible(int ar[] , int k , int res){
        int student = 1 , sum = 0 ;
        for(int i = 0 ; i < ar.length ; i ++){
            if(sum + ar[i] > res){
                student ++ ;
                sum = ar[i] ;
            }
            else{
                sum += ar[i] ;
            }
        }
        return student <= k ;
    }
}
public class Books_allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the number of elements you want to have inside that array.");
//        int n = sc.nextInt() ;
//        int[] ar = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            System.out.println("Enter the element at index: " + (i + 1));
//            ar[i] = sc.nextInt() ;
//        }
        int[] ar = {10 , 10 , 20 , 30} ;
        min_range ob = new min_range() ;
        int ans = ob.minpages(ar , 2) ;
        System.out.println("Minimum value alloted to the first student is: " + ans);
    }
}
