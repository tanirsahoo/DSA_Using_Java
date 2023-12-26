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
}
public class Permutation_string {
    public static void main(String[] args) {
        string_work ob = new string_work() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the String.");
        String a = sc.nextLine() ;
        int len = a.length() ;
        boolean result = ob.palindrome_string(a , len - 1 , 0) ;
        if(result == true)
            System.out.println("Palindrome String");
        else
            System.out.println("Not a palindrome String");
    }
}
