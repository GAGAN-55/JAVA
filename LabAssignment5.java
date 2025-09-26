//Types of Constructor and their uses

class Car{
     //Instances variables for car details
    private String brand;
    private String model;
    private int year;

    //No-argument constructor
    public Car(){
        //Calling the one-argument constructor using this()
        this("Unknown");
    }
     //One - argument constructor(brand)
     public Car(String brand){
        this(brand,"Unknown", 0);
     }

     //Three argument constructor (brand, model, year)
     public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
     }

     //Method to display car information
     public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
     }
}
   
public class LabAssignment4{
    public static void main(String[] args){
        //Creating objects using different constructors
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Tesla","Model 3", 2025);

        //Displaying car information
        System.out.println("Car 1 details: ");
        car1.displayInfo();
        System.out.println();

        System.out.println("Car 2 details: ");
        car2.displayInfo();
        System.out.println();

        System.out.println("Car 3 details:");
        car3.displayInfo();

     }
}
    
     
