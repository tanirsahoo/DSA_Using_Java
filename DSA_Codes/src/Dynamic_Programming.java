import java.util.Arrays;

public class Dynamic_Programming {
    public static int find_fibonacci(int n , int[] dp){
        if(n == 1)
            return 1 ;
        else if(n == 0)
            return 0 ;
        else if(dp[n] != -1){
            return dp[n] ;
        }
        else{
            dp[n] = find_fibonacci(n - 1 , dp) + find_fibonacci(n - 2 , dp) ;
            return dp[n] ;
        }
    }
    public static void main(String[] args) {
        int n = 10 ;
        int[] dp = new int[n + 1] ;
        dp[0] = 0 ;
        Arrays.fill(dp , -1);
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        for(int i = 2 ; i <= n ; i ++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }
}