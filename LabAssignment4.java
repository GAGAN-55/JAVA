//Base class Shape

class Shape {
    //Constructor
    public Shape() {
        // Base class constructor 
    }

    public void area(){
        System.out.println("Area not defined for this Shape. ");
    }
}

//Subclass Circle
class Circle extends Shape {
    private double radius;

    //Constructor to initialize the radius of the circle
    public Circle(double radius){
        this.radius = radius;
    }

    //Overriding the area method to calculate area of a circle 
    public void area() { 
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

//Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    //Constructor to initialize the length and width of the rectangle
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    //Overriding the area method to calculate area of a circle 
    public void area() { 
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class LabAssignment4 {
    public static void main(String[] args) {
        //Create an object of Circle
        Circle circle = new Circle(4.0);
        circle.area(); // Display area of circle

        //Create an object of Rectangle
        Rectangle rectangle = new Rectangle(5.9, 4.5);
        rectangle.area(); // Display area of rectangle
    }
}
