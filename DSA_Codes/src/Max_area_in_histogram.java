import java.util.Stack;

class smaller_element_find{
    private static int[] next_smaller_element(int[] ar){
        int[] ns = new int[ar.length] ;
        Stack<Integer> st = new Stack<Integer>() ;
        Stack<Integer> index = new Stack<Integer>() ;
        st.push(Integer.MIN_VALUE) ;
        index.push(ar.length) ;
        int j = 0 ;
        for(int i = (ar.length - 1) ; i >= 0 ; i --){
            if(ar[i] > st.peek()){
                st.push(ar[i]) ;
                ns[i] = index.peek() ;
                index.push(i) ;
            }
            else{
                while(ar[i] <= st.peek()){
                    st.pop() ;
                    index.pop() ;
                }
                st.push(ar[i]) ;
                ns[i] = index.peek() ;
                index.push(i) ;
            }
        }
        return ns ;
    }
    private static int[] previous_smaller_element(int[] ar){
        int[] ps = new int[ar.length] ;
        Stack<Integer> st = new Stack<Integer>() ;
        Stack<Integer> index = new Stack<Integer>() ;
        st.push(Integer.MIN_VALUE) ;
        index.push(-1) ;
        int j = 0 ;
        for(int i = 0 ; i < ar.length ; i ++){
            if(ar[i] > st.peek()){
                st.push(ar[i]) ;
                ps[i] = index.peek() ;
                index.push(i) ;
            }
            else{
                while(ar[i] <= st.peek()){
                    st.pop() ;
                    index.pop() ;
                }
                st.push(ar[i]) ;
                ps[i] = index.peek() ;
                index.push(i) ;
            }
        }
        return ps ;
    }
    public int largest_rectangle(int[] arr){
        int[] ar = new int[arr.length] ;
        for(int i = 0 ; i < arr.length ; i ++){
            ar[i] = arr[i] ;
        }
        int[] ns = next_smaller_element(ar) ;
        int[] ps = previous_smaller_element(ar) ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < ar.length ; i ++){
            ar[i] = (ns[i] - ps[i] - 1) * ar[i] ;
            if(ar[i] > max)
                max = ar[i] ;
        }
        return max ;
    }
}

public class Max_area_in_histogram {
    public static void main(String[] args) {
        int[] ar = {4 , 2 , 1 , 5 , 6 , 3 , 2 , 4 , 2} ;
        smaller_element_find ob =  new smaller_element_find() ;
        int max_area = ob.largest_rectangle(ar) ;
        System.out.println("Histogram with Largest Area: " + max_area);
    }
}
