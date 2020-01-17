/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishita;
import java.util.Scanner; // importing Scanner from java library
/**
 *
 * @author jyoti
 */
public class Ishita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        book a1 = new book(); // creating an object a1 so that values can be imported
        
        System.out.println("From default constructore");
        System.out.println("Book name = " +a1.getName()); //getting name from class "book"
         System.out.println("Quantity = " +a1.getQuantity()); //getting quantity from class "book"
         System.out.println("Price = " +a1.getprice()); // getting price from class "book"
         System.out.println("Total book price = " +a1.getPrice()); //getting total price
         System.out.println("");
         
         System.out.println("From argument constructore");
         Scanner input = new Scanner(System.in); 
        System.out.println("Enter the name of the book");
        String name = input.nextLine(); // prompting the user to enter name of the book
        System.out.println("Enter the quantity you need");
        int quantity = input.nextInt(); // prompting the user to enter quantity of the book
        System.out.println("Enter the price");
        double price = input.nextDouble(); // prompting the user to enter price of the book
        System.out.println("");
        
        book a2 = new book(name,quantity,price); //creating another object a2 to get values entered by user
        
        System.out.println("Book name = " +a2.getName());
         System.out.println("Quantity = " +a2.getQuantity());
         System.out.println("Price = " +a2.getprice());
         System.out.println("Total book price = " +a2.getPrice());
        
         
        
        
    }
    
}
