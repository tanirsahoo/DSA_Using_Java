package Java_Recap;

public class Nested_Class {
    int a ;
    String b = "Tanir Sahoo" ;
    Nested_Class(){
        System.out.println("This is the demo for Nested Class");
    }
    class inner_class extends Nested_Class{
        inner_class(){
            System.out.println("I am inside the inner_class now");
        }
        private static int factorial(int n){
            if(n == 0 || n == 1)
                return 1 ;
            else
                return n * factorial(n - 1) ;
        }
        int v = 5 ;
    }

    public static void main(String[] args) {
        Nested_Class obb = new Nested_Class() ;
//        Nested_Class o = new Nested_Class.inner_class() ;
    }
}
