/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishita;

/**
 *
 * @author jyoti
 */
public class book {
    private String name; // declaring private variable "name"
    private int quantity; // declaring private variable "quantity"
    private double price; // declaring private variable "price"
    
    public book() // creating no-argument constructor to give default values
    {
        name = "java";
        quantity = 10;
        price = 50.5;
    }
    public book(String name,int quantity, double price) // creating argument constructor to get values entered by user
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    
    //creating get methods to get access to private variables to another classes
    public String getName() 
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getprice()
    {
        return price;
    }
    public double getPrice()
    {
        return quantity*price;
    }
   
       
   } 
    

