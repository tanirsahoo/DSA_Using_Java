import java.util.Arrays;

public class Minimum_Number_of_Coins {
    static int ct ;
    public static int cal_min(int ar[] , int n , int[] dp){
        if(n == 0)
            return 0 ;
        else if(dp[n] != -1)
            return dp[n] ;
        else{
            int min = Integer.MAX_VALUE ;
            for(int i = 0 ; i < ar.length ; i ++){
                if(n - ar[i] < 0){
                    i ++ ;
                    continue;
                }
                ct = cal_min(ar, (n - ar[i]) , dp) + 1 ;
                if(ct < min){
                    min = ct ;
                    dp[n] = min ;
                }
            }
            return dp[n] ;
        }
    }
    public static void main(String[] args) {
        int n = 7 ;
        int[] ar = {1 , 2 , 3};
        int[] dp = new int[n + 1] ;
        Arrays.fill(dp , -1);
        int min_val = cal_min(ar , n , dp) ;
        System.out.println("Minimum number of coins required to reach the given amount is: " + min_val);
    }
}
