class Customer {

    int customerID;
    String customerName;

    Customer(int id, String name) {
        this.customerID = id;
        this.customerName = name;
    }

    void addCustomer() {
        System.out.println("Customer added: " + customerName);
    }

    void deleteCustomer() {
        System.out.println("Customer deleted: " + customerID);
    }
}

// Reverse Engineering wala class
class Product {

    int productID;
    String productName;

    Product(int id, String name) {
        this.productID = id;
        this.productName = name;
    }

    void addProduct() {
        System.out.println("Product added: " + productID);
    }

    void selectProduct() {
        System.out.println("Product selected: " + productID);
    }
}

// Main class (sirf ek hi hoga)
public class Customer1{

    public static void main(String[] args) {

        // Forward Engineering (Customer)
        Customer c = new Customer(101, "Raj Sharma");
        c.addCustomer();
        c.deleteCustomer();

        // Reverse Engineering (Product)
        Product p = new Product(201, "Laptop");
        p.addProduct();
        p.selectProduct();
    }
}