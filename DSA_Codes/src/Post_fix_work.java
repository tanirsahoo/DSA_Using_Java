import java.util.Hashtable;
import java.util.Stack;

public class Post_fix_work {
    private static String convert_to_postfix(String exp){
        String new_exp = "" ;
        int top = -1 ;
        Stack<Character> st = new Stack<>() ;
        Hashtable<Character , Integer> hs = new Hashtable<>() ;
        hs.put('+' , 1) ;
        hs.put('-' , 1) ;
        hs.put('*' , 2) ;
        hs.put('/' , 2) ;
        hs.put('^' , 3) ;
        hs.put('(' , 4) ;
        hs.put(')' , 4) ;
        for(int i = 0 ; i < exp.length() ; i ++){
            char ch = exp.charAt(i) ;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
                if(st.empty()){
                    st.push(ch) ;
                    top ++ ;
                }
                else if(hs.get(ch) > hs.get(st.peek())){
                    st.push(ch) ;
                    top ++ ;
                }
                else if(hs.get(ch) < hs.get(st.peek())){
                    if(st.peek() == '('){
                        st.push(ch) ;
                        top ++ ;
                    }
                    else {
                        while ((!st.empty()) && (st.peek() != '(') && (hs.get(ch) <= hs.get(st.peek()))) {
                            new_exp += st.pop();
                            top -- ;
                        }
                        st.push(ch);
                        top ++ ;
                    }
                }
                else{
                    new_exp += st.pop() ;
                    st.push(ch) ;
                }
            }
            else if(ch == '(' || ch == ')'){
                if(ch == '('){
                    st.push(ch) ;
                    top ++ ;
                }
                if(ch == ')'){
                    while(st.peek() != '('){
                        new_exp += st.pop() ;
                        top -- ;
                    }
                    st.pop() ;
                    top -- ;
                }
            }
            else{
                new_exp += exp.charAt(i) ;
            }
        }
        while(top != -1){
            new_exp += st.pop() ;
            top -- ;
        }
        return new_exp ;
    }
    private static int postfix_value(String msg){
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ; i < msg.length() ; i ++){
            char ch = msg.charAt(i) ;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int var1 = st.pop() ;
                int var2 = st.pop() ;
                int result ;
                switch (ch) {
                    case '+':
                        result = var2 + var1;
                        st.push(result);
                        break;
                    case '-':
                        result = var2 - var1;
                        st.push(result);
                        break;
                    case '*':
                        result = var2 * var1;
                        st.push(result);
                        break;
                    case '/':
                        result = var2 / var1;
                        st.push(result);
                        break;
                    default:
                        System.out.println("Wrong Operator Found!");
                        break ;
                }
            }
            else{
                st.push(Integer.parseInt("" + ch)) ;
            }
        }
        return st.pop() ;
    }
    public static void main(String[] args) {
        String msg = "1+2-3*4+(3+6*1+9)" ;
        String post = convert_to_postfix(msg) ;
        System.out.println("Postfix Expression is: " + post);
        int result = postfix_value(post) ;
        System.out.println("The result after evaluation is: " + result);
    }
}
