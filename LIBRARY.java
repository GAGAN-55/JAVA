// Superclass LibraryUser
class LibraryUser {
    protected int userId;
    protected String name;

    // Constructor
    public LibraryUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Method to be overridden in subclasses
    public int maxBooksAllowed() {
        return 0; // Default, not used directly, overridden in subclasses
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}

// Subclass Student
class Student extends LibraryUser {
    public Student(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 5; // Student can borrow up to 5 books
    }
}

// Subclass Teacher
class Teacher extends LibraryUser {
    public Teacher(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 10; // Teacher can borrow up to 10 books
    }
}

// Subclass Researcher
class Researcher extends LibraryUser {
    public Researcher(int userId, String name) {
        super(userId, name);
    }

    @Override
    public int maxBooksAllowed() {
        return 15; // Researcher can borrow up to 15 books
    }
}

// Main class to manage the library system
public class LIBRARY{
    
    public static void main(String[] args) {
        
        // Create users directly with an array of LibraryUser objects
        LibraryUser[] users = new LibraryUser[3]; // Array to store 3 users
        
        // Create and add users to the array
        users[0] = new Student(1, "John Doe");
        users[1] = new Teacher(2, "Dr. Smith");
        users[2] = new Researcher(3, "Alice Johnson");

        // Display max books allowed for each user
        System.out.println("Library Users and their Borrowing Limits:");
        for (int i = 0; i < users.length; i++) {
            LibraryUser user = users[i];
            System.out.println(user + " can borrow up to " + user.maxBooksAllowed() + " books.");
        }
    }
}

