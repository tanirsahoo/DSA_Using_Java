/*
1. N-Queen Problem: N-Queen problem states that we need to place N-Queens in an N X N matrix such that no queen interrupts the movement of other queen.
2. Sudoku Solver: The user needs to enter an array which would contain some already filled numbers and zeros depicting void places. The algorithm needs to identify the most suitable element for the place.
*/
package DSA_Codes.src;

import java.util.Arrays;
import java.util.Scanner;

class N_Queen_Problem{
    public boolean isSafe(int arr[][] , int row , int col , int N){
        for(int i = 0 ; i <= row ; i ++){
            if(arr[i][col] == 1)
                return false ;
        }
        int i = row;
        int j = col;
        while(i >= 0 && j >= 0){
            if(arr[i][j] == 1){
                return false ;
            }
            i -- ;
            j -- ;
        }
        i = row ;
        j = col ;
        while(i >= 0 && j < N){
            if(arr[i][j] == 1){
                return false ;
            }
            i -- ;
            j ++ ;
        }
        return true ;
    }
    public boolean nQueen(int arr[][] , int row , int N){
        if(row >= N)
            return true ;
        for(int i = 0 ; i < N ; i ++){
            if(isSafe(arr , row , i , N)) {
                arr[row][i] = 1;
                if (nQueen(arr, row + 1, N))
                    return true;
                arr[row][i] = 0;
            }
//            display(arr , N) ;
        }
        return false ;
    }
    public void display(int arr[][] , int n){
//        int j = 0 ;
        System.out.println("------------------------------------------");
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
}

class Sudoku_Solver{
    public boolean isSafe(int arr[][] , int row , int col , int N , int num){
        for(int i = 0 ; i < N ; i ++){
            if(arr[i][col] == num)
                return false ;
        }
        for(int j = 0 ; j < N ; j ++){
            if(arr[row][j] == num)
                return false ;
        }
        int array_row = row - (row % 3) ;
        int array_col = col - (col % 3) ;
        for(int i = 0 ; i < 3 ; i ++)
            for(int j = 0 ; j < 3 ; j ++){
                if(arr[i + array_row][j + array_col] == num)
                    return false ;
            }
        return true ;
    }
    public boolean sudoku(int arr[][] , int row , int col , int N){
        if(row == N-1 && col == N)
            return true ;
        if(col == N){
            row ++ ;
            col = 0 ;
        }
        if(arr[row][col] != 0)
            return sudoku(arr , row , col + 1 , N) ;
        for(int num = 1 ; num < 10 ; num ++){
            if(isSafe(arr , row , col , N , num)) {
                arr[row][col] = num;
                if(sudoku(arr , row , col + 1 , N))
                    return true ;
            }
            arr[row][col] = 0 ;
        }
        return false ;
    }
    void display_matrix(int arr[][] , int N){
        for(int i = 0 ; i < N ; i ++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
public class N_Queen_and_Sudoku_Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt() ;
//        int[][] arr = new int[n][n] ;
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < n ; j ++){
//                arr[i][j] = 0 ;
//            }
//        }
//        N_Queen_Problem ob = new N_Queen_Problem() ;
//        if(ob.nQueen(arr , 0 , n))
//            ob.display(arr , n) ;
        int[][] arr = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} } ;
        Sudoku_Solver ob1 = new Sudoku_Solver() ;
        if(ob1.sudoku(arr , 0 , 0 , 9))
            ob1.display_matrix(arr , 9);
    }
}