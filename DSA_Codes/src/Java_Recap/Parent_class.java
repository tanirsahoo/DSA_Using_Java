package Java_Recap;

public class Parent_class {
    private int a ;
    private String b ;
    private float d ;
    Parent_class(){
        System.out.println("This is a demo class to check my Inheritance Knowledge.");
    }
    Parent_class(int a , String b , float d){
        this.a = a ;
        this.b = b ;
        this.d = d ;
        System.out.println("The Number name and the floating point number are: " + a + " , " + b + " , " + d);
    }
    private static int fibonacci(int n){
        if(n == 1)
            return 0 ;
        else if(n == 2)
            return 1 ;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2)) ;
    }
}
class child1 extends Parent_class{
    child1(){
        super(1 , "Tanir Sahoo" , 2.9f) ;
        System.out.println("This is the child class speaking");
    }
    public static void main(String[] args) {
        child1 ob = new child1() ;
    }
}