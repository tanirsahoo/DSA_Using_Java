/*
* In a heap the properties are:
* The tree must be in complete binary tree.
* If index is represented by i, the node at any index is represented as ar[i].
* The parent index of any node in the heap is represented as: Math.abs(i/2), and the element at that index is represented as ar[Math.abs(i/2)];
* The left child of any node in the heap is represented as ar[2 * i];
* The right child of any node in the heap is represented as ar[2*i+1];
* */

import java.util.Scanner;

class heap_actions{
    public void insert_element(int[] ar , int elem , int index){
        ar[index] = elem ;
        int id = index ;
        while(elem > ar[Math.abs(id / 2)]){
            //Swapping the values of elem and ar[Math.abs(id / 2)]
            if(Math.abs(id/2) == 0){
                break;
            }
            else {
                int swap_var = ar[Math.abs(id / 2)];
                ar[Math.abs(id / 2)] = elem;
                ar[id] = swap_var;
                id = Math.abs(id / 2);
//                ar[Math.abs(id / 2)] = ar[id] ^ ar[Math.abs(id / 2)] ;
//                ar[id] = ar[id] ^ ar[Math.abs(id / 2)] ;
//                ar[Math.abs(id / 2)] = ar[id] ^ ar[Math.abs(id / 2)] ;
//                id = Math.abs(id / 2) ;
            }
        }
    }

    public int delete_element(int[] ar , int size){
        int extract = ar[1] ;
        ar[1] = ar[size] ;
        int index = 1 ;
        while((((index * 2) <= size) || ((index * 2 + 1) <= size)) && (ar[index * 2] > ar[index] || ar[index * 2 + 1] > ar[index])){
            int larger = ar[index * 2] > ar[index * 2 + 1] ? (index * 2) : (index * 2 + 1) ;
//            if(ar[index * 2] > ar[index]){
//                int swap_var = ar[index * 2];
//                ar[index * 2] = ar[index];
//                ar[index] = swap_var ;
//                index = index * 2 ;
//            }
//            else if(ar[index * 2 + 1] > ar[index]){
//                int swap_var = ar[index * 2 + 1];
//                ar[index * 2 + 1] = ar[index];
//                ar[index] = swap_var ;
//                index = index * 2 + 1 ;
//            }
//            else{
//                break ;
//            }
            if(ar[index] < ar[larger]){
                int swap_var = ar[larger] ;
                ar[larger] = ar[index] ;
                ar[index] = swap_var ;
                index = larger ;
            }
            else{
                break ;
            }
        }
        return extract ;
    }
    public void display(int[] ar , int len){
//        for(int i = 0 ; i < ar.length ; i ++){
//            for(int j = 1 ; j <= (Math.pow(2 , i)) ; j ++){
//                System.out.print(ar[i ++]);
//            }
//            System.out.println();
//        }
        for(int i = 1 ; i <= len ; i ++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
public class Heap_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        heap_actions ob = new heap_actions() ;
        System.out.println("Enter the number of elements you want to have in your tree.");
        int n = sc.nextInt() ;
        int[] ar = new int[n + 1];
        int insert_index = 0;
        ar[0] = -1;
        int num = n ;
        while(n -- != 0) {
            System.out.println("Enter the element you want to insert inside the heap.");
            int elem = sc.nextInt();
            ob.insert_element(ar, elem, ++ insert_index);
            ob.display(ar , insert_index);
        }
        int ch = 1 ;
        while(ch == 1) {
            System.out.println("Enter any number other than 1 to terminate deletion");
            ch = sc.nextInt() ;
            if(ch == 1 && insert_index > 0) {
                int del_elem = ob.delete_element(ar, num --);
                insert_index -- ;
                System.out.println("The deleted element is: " + del_elem);
                System.out.println("Value of insert index: " + insert_index);
                ob.display(ar , insert_index);
            }
            else{
                break ;
            }
        }
    }
}
