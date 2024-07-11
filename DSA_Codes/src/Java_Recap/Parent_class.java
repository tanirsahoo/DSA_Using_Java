package Java_Recap;

public class Parent_class extends child1{
    private int a ;
    private String b ;
    private float d ;
//    Parent_class(){
//        System.out.println("This is a demo class to check my Inheritance Knowledge.");
//    }
    Parent_class(int a , String b , float d){
        this.a = a ;
        this.b = b ;
        this.d = d ;
        System.out.println("The Number name and the floating point number are: " + a + " , " + b + " , " + d);
    }

    //------------Getters-----------
    public int getA(){
        return a ;
    }
    public String getB(){
        return b ;
    }
    public float getD(){
        return d ;
    }



    protected static int fibonacci(int n){
        if(n == 1)
            return 0 ;
        else if(n == 2)
            return 1 ;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2)) ;
    }
}
class child1 extends Parent_class{
//    child1(){
//        System.out.println("This is the child class speaking");
//    }
    child1(int a , int b , String c , String d , double f , float g , float h){
        super(a , c , g) ;
        System.out.println("The Entered Values are: " + a + " , " + b + " , " + c + " , " + d + " , " + f + " , " + g + " , " + h );
    }
    public static void main(String[] args) {
//        child1 ob = new child1() ;
        child1 ob = new child1(1 , 6 , "Tanir" , "Sahoo" , 6.165615 , 0.65f , 0.655f) ;
        System.out.println(ob.fibonacci(10)) ;
    }
}