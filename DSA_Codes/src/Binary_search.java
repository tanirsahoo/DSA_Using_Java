import java.util.Scanner;
class search_algo{
    public int find_element_index(int ar[] , int n){
        int lb = 0 , ub = ar.length - 1;
        while(lb <= ub){
            int mb = (lb + ub) / 2 ;
            if(ar[mb] == n)
                return mb ;
            else if(ar[mb] > n)
                ub = mb - 1 ;
            else
                lb = mb + 1 ;
        }
        return -1 ;
    }
    public int find_element_index_recursion(int ar[] , int n , int lb , int ub){
        if(lb > ub)
            return -1 ;
        else {
                int mb = (lb + ub) / 2;
                if (ar[mb] == n)
                    return mb;
                else if (ar[mb] > n)
                    return find_element_index_recursion(ar, n, lb, mb - 1);
                else
                    return find_element_index_recursion(ar, n, mb + 1, ub);
        }
    }
}
public class Binary_search {
    public static void main(String[] args) {
        int[] ar = {1 , 2 , 5 , 6 , 9 , 12 , 14 , 19 , 20} ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the element that you want to search.");
        int n = sc.nextInt() ;
        search_algo ob = new search_algo() ;
//        int index = ob.find_element_index(ar , n) ;
        int index = ob.find_element_index_recursion(ar , n , 0 , ar.length) ;
        if(index == -1)
            System.out.println("No such element exist in this array.");
        else
            System.out.println("The index at which the element is present is: " + index);
    }
}
