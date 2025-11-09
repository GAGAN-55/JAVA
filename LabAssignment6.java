//Multilevel inheritance

//Base class to store basic student details
class Student{
    String rollNo;
    String name;
    String course;

    //Constructor to initialize student details
    Student(String rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    //Method to display student details
    void displayStudentInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

//Subclass Marks to store marks of three subjects 
class Marks extends Student {
    int subject1;
    int subject2;
    int subject3;

    //Constructor to initialize student details and marks
    Marks(String rollNo, String name, String course, int subject1, int subject2, int subject3){
        super(rollNo, name, course); //Calling base class constructor
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    //Method to display marks of the student
    void displayMarks(){
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);
    }
}

//Subclass Result to calculate total marks, percentage and grade
class Result extends Marks{
    int totalMarks;
    double percentage;
    String grade;

    //Constructor to initialize student details and marks
    Result(String rollNo, String name, String course, int subject1, int subject2, int subject3){
        super(rollNo, name, course, subject1, subject2, subject3); //Calling Marks constructor
    }
    //Method to calculate total marks and percentage
    void calculateResult(){
        totalMarks = subject1 + subject2 + subject3;
        percentage = (totalMarks / 3.0);
    }

    //Method to assign grade based on percentage 
    void assignGrade(){
        if(percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    //Method to display the complete student result
    void displayResult(){
        displayStudentInfo();
        displayMarks();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

//Main class to test the functionality
public class LabAssignment6 {
    public static void main(String[] args) {
        //Create an object of Result class and initialize student details and marks
        Result student1 = new Result("A102" , "John" , "Computer Science", 90, 92, 99);

        //Calculate the total, percentage, and grade
        student1.calculateResult();
        student1.assignGrade(); 

        //Display the student information, marks, total, percentage, and grade
        student1.displayResult();
    }
}