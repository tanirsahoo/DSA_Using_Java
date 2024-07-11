package Java_Recap;

//Abstract class is a class that contains abstract method(even if one method is abstract then the class will be declared abstract)

abstract class Animal{
    Animal(){
        System.out.println("All animals are made up of multiple cells.");
    }
    public void walk(){
        System.out.println("It can walk..");
    }
    public void eat(){
        System.out.println("It can eat");
    }
    abstract protected void fly() ;

    public static void main(String[] args) {
        Deer ob = new Deer() ;
        ob.walk();
        ob.eat();
        ob.fly();
    }
}
class Deer extends Animal{
    protected void fly(){
        System.out.println("Deers can't fly");
    }
}

abstract class Birds extends Animal{
    Birds(){
        System.out.println("All Birds can fly...");
    }
    abstract boolean type() ;
}
public class Abstract_class {
    public static void main(String[] args) {
        Birds ob = new Birds() {
            @Override
            boolean type() {
                return false;
            }

            @Override
            protected void fly() {
                System.out.println("Yes the Bird can fly");
            }
        } ;
        ob.eat();
        System.out.println((ob.type() ? "The Bird is Herbivorous" : "The Bird is a Nigga")) ;
        ob.fly();
        ob.walk();
    }
}
