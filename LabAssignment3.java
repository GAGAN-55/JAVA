//Constructor Overloading

class Shape {
    double radius;
    double length, width;

    //Constructor for Circle
    Shape(double radius){
        this.radius = radius;
        this.length = 0;
        this.width = 0;
    }

    //Constructor for Rectangle
    Shape(double length, double width){
        this.length = length;
        this.width = width;
        this.radius = 0;
    }

    //Method to calculate and display area of circle
    void areaCircle(){
        if(radius>0){
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle with radius" + radius + "is" + area);
        } else {
            System.out.println("Not a circle shape");
        }
    }

     //Method to calculate and display area of rectangle
    void areaRectangle(){
        if(length > 0 && width >0 ){
            double area = length * width;
            System.out.println("Area of Circle with length" + length + "and width" + width + "is:" + area);
        } else {
            System.out.println("Not a rectangle shape");
        }
    }
}

public class LabAssignment3{
    public static void main(String[] args) {
        
        //Create circle object with radius 9
        Shape circle = new Shape(9);
        circle.areaCircle();

        //Create rectangle object with length 12 and width 19
        Shape rectangle = new Shape(12,19);
        rectangle.areaRectangle();

     }
}