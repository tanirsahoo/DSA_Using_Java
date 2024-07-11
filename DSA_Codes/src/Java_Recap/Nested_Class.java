package Java_Recap;

public class Nested_Class {
    int a ;
    String b = "Tanir Sahoo" ;
    Nested_Class(){
        System.out.println("This is the demo for Nested Class");
    }
    class inner_class{ // This is a inner class declared inside the class Nested_Class
        inner_class(){
            System.out.println("I am inside the inner_class now");
        }
        protected static int factorial(int n){
            if(n == 0 || n == 1)
                return 1 ;
            else
                return n * factorial(n - 1) ;
        }
        protected void display_weirdos(){ // This function would be modified to understand the working of an anonymous class.
            System.out.println("Here I am gonna display this weird String.");
        }
    }

    public static void main(String[] args) {
        Nested_Class obb = new Nested_Class() ;
        Nested_Class.inner_class o = obb.new inner_class(){ // This is an Anonymous Class -- Anonymous classes can't have static methods.
            protected void display_weirdos(){
                System.out.println("Here is the modified String that I am going to display inside the anonymous class.");
            }
        } ;
        o.display_weirdos();
        System.out.println("The factorial of 10 is: " + o.factorial(10)) ;
    }
}
