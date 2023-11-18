import java.util.Scanner ;

//Today's Agenda:
//1. Bit masking
//2. Find i'th bit
//3. Set i'th bit
//4. Clear i'th bit
//5. Find number of bits to change to convert a to b
class operation{
    int a ;
    operation(int p){
        a = p ;
    }
    void find(int n){ // Find the n th bit in the given number a
        int k = 1 << n ; // We are shifting the value by n bits and creating a mask and then performing and operation to check whether the bit present at i'th position in the original number is 1 or 0.
        if((a & k) > 0)
            System.out.println("The bit at i'th position is 1.");
        else
            System.out.println("The bit at i'th position is 0.");
    }
    void set(int n , int ch){ // Setting the nth bit in the given number by 0 or 1 according to the input from the user.
        int k = 1 << n ;
        switch(ch){
            case 1:
                int new_val = a | k ;
                System.out.println("Therefore the new number after changing the bit is: " + new_val);
                break ;
            case 2:
                System.out.println("Working on it.");
                break ;
            default:
                System.out.println("You have entered a Wrong Choice.");
                break ;
        }
    }
}
public class Bit_Masking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int num ;
        System.out.println("Enter the number.");
        num = sc.nextInt() ;
        operation ob = new operation(num) ;
        System.out.println("+++++++++++++++++++Finding the bit at i'th position+++++++++++++++++++") ;
        System.out.println("Enter the index at which you want to check the bit.");
        int index = sc.nextInt() ;
        ob.find(index) ;
        System.out.println("+++++++++++++++++++Setting the bit at i'th position+++++++++++++++++++") ;
        System.out.println("Enter the index at which you set the bit.");
        int ind = sc.nextInt() ;
        System.out.println("Enter your choice for the following operations:\n1: Setting the value to 1.\n2. Setting the value to 0.") ;
        int choice = sc.nextInt() ;
        ob.set(ind , choice) ;
    }
}
