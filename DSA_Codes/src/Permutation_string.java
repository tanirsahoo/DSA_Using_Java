/*
1. Palindrome String: A Palindrome string is a string which when reversed gives the exact same output.
2. Superset of a string: To find all the possible combinations that could be framed from a given string. For example: abc = {"" , a , b , c , ab , bc , ac , abc}
   Now:         abc
                /\
               a  ""
             /  \   /\
           ab   a  b   ""     -->> Adding b or "" to every element
          /\   /\  /\   /\
      abc  ab ac a bc b c ""  -->> Adding c or "" to every element
3. Print all permutations of a given string: Find all the combinations that could be framed from a given string.
*/
package DSA_Codes.src;

import java.util.Scanner;

class string_work{
    public boolean palindrome_string(String a, int l , int f){
        if(f >= l)
            return true ;
        else if(a.charAt(l) != a.charAt(f))
            return false ;
        else
            return palindrome_string(a , (l - 1) , (f + 1)) ;
    }

    public void power_set_string(String src , int index , String cr){
        if(index == src.length()){
            System.out.println(cr);
            return ;
        }
        power_set_string(src , index + 1 , cr + src.charAt(index));
        power_set_string(src , index + 1 , cr);
    }
    public String swap(String a , int l , int f){
        String new_string = "" ;
        for(int i = 0 ; i < a.length() ; i ++){
            if(i == l)
                new_string = new_string + a.charAt(f) ;
            else if(i == f)
                new_string = new_string + a.charAt(l) ;
            else
                new_string = new_string + a.charAt(i) ;
        }
        return new_string ;
    }
    public void permute(String a , int f , int l){
        if(l == f){
            System.out.println(a);
        }
        for(int i = f ; i <= l ; i ++){
            a = swap(a , (f - 1) , (i - 1)) ;
            permute(a , f+1 , l);
            a = swap(a , (f - 1) , (i - 1)) ;
        }
    }
}
public class Permutation_string {
    public static void main(String[] args) {
        string_work ob = new string_work() ;
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the String.");
//        String a = sc.nextLine() ;
//        int len = a.length() ;
//        boolean result = ob.palindrome_string(a , len - 1 , 0) ;
//        if(result == true)
//            System.out.println("Palindrome String");
//        else
//            System.out.println("Not a palindrome String");
//        ob.power_set_string(a , 0 , "");
        ob.permute("abc" , 1 , 3); // f = first position (Always 1) and l = Last Position(Length of the String)
    }
}
