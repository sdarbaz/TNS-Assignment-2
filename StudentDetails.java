import java.util.Scanner; // Import Scanner for input

public class StudentDetails {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter Full Name with Initial: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter Grade: ");
        char grade = scanner.next().charAt(0);
        
        System.out.print("Enter Percentage (with % symbol): ");
        String percentage = scanner.next();
        
        // Close Scanner
        scanner.close();
        
        // Print the details
        System.out.println("\nStudent Details:");
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);
    }
}