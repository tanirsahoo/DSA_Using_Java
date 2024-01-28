import java.util.HashMap;
import java.util.Scanner;

class SubArray_sum{
    public void check_sub_array_sum(int[] ar , int sum){
        HashMap<Integer , Integer> set = new HashMap<>() ;
        int sum_find = 0 ;
        int start = 0 ;
        int end = -1 ;
        for(int i = 0 ; i < ar.length ; i ++){
            sum_find += ar[i] ;
            if(sum_find - sum == 0)
            {
                start = 0 ;
                end = i ;
                break ;
            }
            if(set.containsKey(sum_find)){
                start = set.get(sum_find - sum) + 1 ;
                end = i ;
                break ;
            }
        }
        if(end == -1)
            System.out.println("No subarray found.");
        else
            System.out.println("Sub Array Found from index: " + start + " to: " + end);
    }

    void int count_distict_elem_in window(int[] ar){

    }
}

public class Hashmap_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array you want to have.");
        int size = sc.nextInt() ;
        int[] ar = new int[size] ;
        for(int i = 0 ; i < size ; i ++){
            System.out.println("Enter the element at index: " + (i + 1));
            ar[i] = sc.nextInt() ;
        }
        System.out.println("Enter the Sum you want to find.");
        int sum = sc.nextInt() ;
        SubArray_sum ob = new SubArray_sum() ;
        ob.check_sub_array_sum(ar , sum);
    }
}
