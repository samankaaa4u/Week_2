/**
    Write a program that does the following:

    1.	Declare 3 variables:
    •	An int variable ‘qty’
    •	A double variable ‘price’
    •	A string variable ‘name’

    2.	Store quantity , price and name of a product in these variables by assigning literal values to these variables.

    3.	The program should display these values on the screen as follows, using a mix of text and above variables
    Product Name is TheProduct, its price is $45 You bought 150 quantity.
 */

public class Exercise_3 {
    public static void main(String[] args) {
        int qty = 150;
        double price = 45.0;
        String name = "The Product";
        
        System.out.println("Product Name is " + name + ", its price is $" + price + " You bought " + qty + " quantity.");
    }
}

/*
    In this program, we declare three variables qty, price, and name of types int, double, and String, respectively. We then assign the literal values 150, 45.0, and "TheProduct" to these variables.
    We then use the System.out.println() method to display the product details on the screen. We concatenate the string literals and the variable values using the + operator to create the desired output.
 */