/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testitemtopurchase;

/**
 *
 * @author peterrodriguez
 */
public class ItemToPurchase 
{
    private String itemName; 
    private String itemDescription;
    private double itemPrice; 
    private int itemQuantity; 
    
//Default Constructor 
    public ItemToPurchase() 
    {
        super(); 
        this.itemName = "0"; 
        this.itemDescription = "none"; 
        this.itemPrice = 0.0; 
        this.itemQuantity = 0; 
    }
//Parameter Constructor 
    public ItemToPurchase(String iName, String iDescription,double iPrice, int iQuantity)
    {
        itemName = iName; itemDescription = iDescription; itemPrice = iPrice; 
        itemQuantity = iQuantity; 
    }
            
// Setters and Getters
    public void setDescription(String description){
        this.itemDescription = description; 
    }
    public String getItemName()
    {
        return itemName; 
    }
    public String getDescription() 
    {
        return itemDescription; 
    }
    public double getItemPrice()
    {
        return itemPrice; 
    }
    public int getItemQuantity()
    {
        return itemQuantity;
    }
    
    // Outputs the item name followed by the quantity, price, and subtotal
    public String printItemCost()
    {
        double subtotal; 
        subtotal = itemPrice * itemQuantity; 
        return itemName + " " + itemQuantity + " @ $" + itemPrice 
                + " = $" + subtotal; 
    }
    
    // Outputs the item name and description
    public String printItemDescription()
    {
        return itemName + ": " + itemDescription + ".";
    }
    
    @Override
    public String toString ()
    {
        return "Item Name:" + itemName + "\n"
                + "Item Description:" + itemDescription + "\n"
                + "Item Price:" + itemPrice + "\n" 
                + "Item Quanitity:" + itemQuantity + "\n"; 
    }
}
