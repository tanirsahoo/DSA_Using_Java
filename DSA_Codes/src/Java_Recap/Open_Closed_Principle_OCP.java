package Java_Recap;

interface Shape{
    double calculateArea() ;
}

class rectangle implements Shape{
    double length ;
    double breadth ;
    rectangle(double length , double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea(){
        return length * breadth ;
    }
}

class circle implements Shape{
    double radius ;
    circle(double radius){
        this.radius = radius ;
    }
    public double calculateArea(){
        return (Math.PI * radius * radius) ;
    }
}

class AreaCalculation{
    public static double calculateArea(Shape shape){
        return shape.calculateArea() ;
    }

    public static void main(String[] args) {
        Shape shape = new circle(5);
        System.out.println("The area is: " + calculateArea(shape));
    }
}
// Violating SRP
class SRP_Single_Responsibility_Principle{

}