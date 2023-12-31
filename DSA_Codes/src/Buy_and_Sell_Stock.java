/*
Problem statement number 1: In this problem we need to buy a stock and sell it so that we make the maximum profit out of the transaction.
Problem statement number 2: In this problem we can buy and sell as many stocks I want and I need to figure out the maximum profit by performing this activity.
*/
package DSA_Codes.src;

import java.util.Scanner;

class buy_sell_stock_1{
    public int max_profit(int arr[]) {
        int maxprofit = 0;
        int min_so_far = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min_so_far = Math.max(min_so_far, arr[i]);
            int profit = arr[i] - min_so_far;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit ;
    }
}

class buy_sell_stock_2{
    public int max_profit(int ar[]){
        int profit = 0 ;
        for(int i = 1 ; i < ar.length ; i ++){
            if(ar[i] > ar[i-1])
                profit = profit + (ar[i-1] - ar[i]) ;
        }
        return profit ;
    }
}
public class Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements you want to have in the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the number at index: " + i);
            ar[i] = sc.nextInt() ;
        }
//        buy_sell_stock_1 ob = new buy_sell_stock_1() ;
//        System.out.println("The Maximum profit gained is: " + ob.max_profit(ar)) ;
        buy_sell_stock_2 ob2 = new buy_sell_stock_2() ;
        System.out.println("The Maximum profit gained is: " + ob2.max_profit(ar));
    }
}
