package Java_Recap;

//In Dynamic Method Dispatch, the Featured of the parent class gets updated by the methods of the child class,
// as we are creating the instance of the parent class, I would only be able to use those functions of the child class which are also
// Present in the parent class, i.e those functions that has been overridden.
// This feature is used to implement runtime polymorphism as the object of the parent is getting created during the runtime of the program

class Phone{
    public void ring(){
        System.out.println("Your Phone is ringing...");
    }
    public void call(){
        System.out.println("I am calling your friend...");
    }
}

class Smartphone extends Phone{
    public void song(){
        System.out.println("Song Playing...");
    }
    public void call(){
        System.out.println("I am making a video call to your friend...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone ob = new Smartphone() ;
        ob.ring();
        ob.call(); // The call function of the child will get executed.
    }
}
