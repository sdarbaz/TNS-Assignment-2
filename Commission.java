import java.util.Scanner;

public class Commission {
    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();

        scanner.close();
    }

    // Method to calculate commission
    public void calculateCommission() {
        double commission = 0;
        
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("\nSalesperson Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Earned: $" + commission);
    }

    public static void main(String[] args) {
        // Create an object of Commission class
        Commission salesperson = new Commission();
        
        // Get details and calculate commission
        salesperson.getDetails();
        salesperson.calculateCommission();
    }
}