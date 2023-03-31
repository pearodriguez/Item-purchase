/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testitemtopurchase;

import java.util.Scanner;

/**
 *
 * @author peterrodriguez
 */
public class TestItemToPurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name; 
        String description; 
        double price; 
        int quantity; 
        
        Scanner input = new Scanner (System.in); 
        System.out.println("Please enter item Name: "); 
        name = input.nextLine();
        System.out.println("Please enter item Desciption: "); 
        description = input.nextLine(); 
        System.out.println("Please enter item Price: "); 
        price = input.nextDouble(); 
        System.out.println("Please enter item Qty: "); 
        quantity = input.nextInt(); 
        
        ItemToPurchase item = new ItemToPurchase (name, description, price, quantity);   
        
        System.out.println("\n" + item.printItemCost()); 
        System.out.println(item.printItemDescription()); 
        /*
        ItemToPurchase can = item; 
        System.out.println(can.printItemDescription());
        */
    }
    
}
