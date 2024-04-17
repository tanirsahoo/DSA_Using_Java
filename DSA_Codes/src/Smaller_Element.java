import java.util.ArrayList;
import java.util.Scanner;

public class Smaller_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Integer> ar = new ArrayList<>() ;
        ArrayList<Integer> nearest_small = new ArrayList<>() ;
        int ch;
        System.out.println("Enter -1 to end the execution process.");
        while(true){
            System.out.println("Enter the element.");
            ch = sc.nextInt() ;
            if(ch == -1)
                break ;
            ar.add(ch) ;
        }
        stack_implementation_ArrayList ob = new stack_implementation_ArrayList() ; //I have created an object of Stack_Implementation.java that I coded earlier.
        for(int i = 0 ; i < ar.size() ; i ++){
            if(i == 0){
                nearest_small.add(-1) ;
                ob.push(ar.get(i));
            }
            else{
                while(ar.get(i) < ob.peek()){ // Checking for nearest smaller element, by changing (ar.get(i) > ob.peek()) we can make the operation nearest largest element
                    int p = ob.pop() ;
                }
                nearest_small.add(ob.peek()) ;
                ob.push(ar.get(i));
            }
        }
        for(int i =0 ; i < nearest_small.size() ; i ++){
            System.out.print(nearest_small.get(i) + " ");
        }
        System.out.println();
    }
}
