/*
* Finding Distict element in every window of size k --> This problem statement deals with the number of unique elements present in an array of a given window size. Use hashmap to store the number of appearance of every element in an array increment or decrement it and display the number of elements/Key-Value pair inside the hashmap. This provides the number of unique elements inside the given array.
* */

import java.util.*;

class distinct_logic{
    public void Distict_element_with_size_k(int[] ar , int k){
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < k ; i ++){
            map.put(ar[i] , map.getOrDefault(ar[i] , 0) + 1) ;
        }
        System.out.println(map.size());
        for(int i = k ; i < ar.length ; i ++){
            if(map.get(ar[i - k]) == 1){
                map.remove(ar[i-k]) ;
            }
            else{
                map.put(ar[i-k] , map.getOrDefault(ar[i-k] , 0) - 1) ;
            }
            map.put(ar[i] , map.getOrDefault(ar[i] , 0) + 1) ;
            System.out.println(map.size());
        }
    }
}

public class Distinct_element_java {
    public static void main(String[] args) {
        distinct_logic ob = new distinct_logic();
        int ar[] = {1, 2, 2, 1, 5, 6, 6, 3, 2, 4};
        ob.Distict_element_with_size_k(ar, 4);
    }
}
