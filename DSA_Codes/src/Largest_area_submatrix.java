
public class Largest_area_submatrix {
    private static int largest_area(int[][] ar){
        int[] curr_row = ar[0] ;
        smaller_element_find ob = new smaller_element_find() ;
        int max_height = ob.largest_rectangle(curr_row) ;
        for(int i = 1 ; i < ar.length ; i ++){
            for(int j = 0 ; j < curr_row.length ; j ++){
                if(ar[i][j] > 0){
                    curr_row[j] = curr_row[j] + ar[i][j] ;
                }
                else{
                    curr_row[j] = 0 ;
                }
            }
            int new_max_height = ob.largest_rectangle(curr_row) ;
            max_height = Math.max(max_height , new_max_height) ;
        }
        return max_height ;
    }
    public static void main(String[] args) {
        int[][] ar = {{0 , 1 , 1 , 1 , 1 , 0} , {1 , 1 , 1 , 1 , 0 , 1} , {1 , 1 , 0 , 1 , 1 , 1} , {1 , 1 , 1 , 1 , 1 , 0}} ;
        int max_area = largest_area(ar) ;
        System.out.println("Largest Area is: " + max_area);
    }
}
