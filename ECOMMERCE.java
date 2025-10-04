import java.util.Scanner;

class Product {

    protected int id;
    protected String name;
    protected double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }      

    // Method to be overridden
    public double calculateDiscount() {
        return 0.0; // Default discount: No discount
    }

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: ₹" + price;
    }
}

// Subclass for Electronics
class Electronics extends Product {

public Electronics(int id, String name, double price) {
    super(id, name, price);
}

@Override
public double calculateDiscount() {
// 10% discount on electronics
    return price * 0.10;
}
}

// Subclass for Clothing
class Clothing extends Product {  

public Clothing(int id, String name, double price) {
    super(id, name, price);
}

@Override
public double calculateDiscount() {
    // 20% discount on clothing
    return price * 0.20;
}
}

// Subclass for Groceries
class Groceries extends Product {

public Groceries(int id, String name, double price) {
    super(id, name, price);
}

@Override
public double calculateDiscount() {
    // 5% discount on groceries
    return price * 0.05;
}
}

// Main class
public class ECOMMERCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ E-Commerce System ------");
        System.out.print("Enter number of products to add to cart: ");
        int n = sc.nextInt();

        // Fixed-size array to store products
        Product[] cart = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            System.out.println("Select Category: ");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Groceries");
            System.out.print("Your Choice: ");
            int category = sc.nextInt();

            // Create object based on category
            if (category == 1) {
                cart[i] = new Electronics(id, name, price);
            } else if (category == 2) {
                cart[i] = new Clothing(id, name, price);
            } else if (category == 3) {
                cart[i] = new Groceries(id, name, price);
            } else {
                System.out.println("Invalid category! Adding as a generic product.");
                cart[i] = new Product(id, name, price);
            }
        }

        // Calculate total bill
        double totalBill = 0;
        System.out.println("\n------ BILL DETAILS ------");

        for (int i = 0; i < n; i++) {
            Product p = cart[i];
            double discount = p.calculateDiscount();
            double finalPrice = p.getFinalPrice();
            totalBill += finalPrice;
            System.out.println(p);
            System.out.println("Discount Applied: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-----------------------------------");
        }
        
        System.out.println("TOTAL BILL AMOUNT: ₹" + totalBill);
        System.out.println("Thank you for shopping with us!");
        sc.close();
    }
}