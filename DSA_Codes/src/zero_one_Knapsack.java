public class zero_one_Knapsack {
    static int[] ar ;
    static int profit = 0 ;
    public static int max_profit(int w , int[] ar , int[] v){
        if(w == 0){
            return 0;
        }
        else{
            int max = Integer.MIN_VALUE ;
            for(int i = 0 ; i < ar.length ; i ++){
                if(w - ar[i] < 0){
                    i ++ ;
                    continue ;
                }
                profit = profit + v[i] ;
                max_profit((w - ar[i]) , ar , v) ;
            }
            if(max > profit)
                max = profit ;
            profit = 0 ;
            return max ;
        }
    }
    public static void main(String[] args) {
        int w = 10 ;
        int[] ar = {1 , 3 , 4 ,  6} ;
        int[] v = {20 , 30 , 10 , 50} ;
        System.out.println("Maximum Profit in terms of Amount is: " + max_profit(w , ar , v));
    }
}
