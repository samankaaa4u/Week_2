/*
Follow the same steps as in Exercise 3, but change the step 2 to ask the user for input for these values by using Scanner class.
 */

import java.util.Scanner;

public class Submission_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity bought: ");
        int qty = scanner.nextInt();
        
        System.out.println("Product Name is " + name + ", its price is $" + price + " You bought " + qty + " quantity.");
        
        scanner.close();
    }
}

/*
Explanation:

We import the Scanner class from the java.util package.
We create a new Scanner object called scanner, which will read input from the user.
We use the System.out.print() method to prompt the user to enter the product name, and then use the scanner.nextLine() method to read the user's input and store it in the name variable.
We do the same thing for the product price and quantity, using scanner.nextDouble() and scanner.nextInt() to read the appropriate types of input.
We use the same message concatenation and printing code as before to display the product information.
We close the scanner object to free up resources.
When you run this program, it will ask the user to enter the product name, price, and quantity, and then display the product information based on the user's input.
 */
