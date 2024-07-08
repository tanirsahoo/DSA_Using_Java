package Collection_Framework;

import java.util.Stack;

public class Stack_using_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(20) ;
        st.push(10) ;

        System.out.println(st);

        st.pop() ;

        st.push(15) ;
        st.push(25) ;
        st.push(35) ;

        st.pop() ;
        System.out.println(st.peek());
        System.out.println(st);
    }
}
