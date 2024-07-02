/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;
import entidadesEnum.OrderStatus;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Isaac Duarte
 */
public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("");
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("");
        Client c1 = new Client(name, email);
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = in.nextLine();
        System.out.print("");
     
        Order o = new Order(OrderStatus.valueOf(status), c1);
        
        
        System.out.println("");
        System.out.print("How many items to this order? ");
        int x = in.nextInt();
        
        for(int i = 0; i < x; i++){
            System.out.println("Enter #" + (i +1) + " item data: ");
            System.out.print("Product name: ");
            in.nextLine();
            String pName = in.nextLine();
            System.out.print("");
            System.out.print("Product price: ");
            Double pPrice = in.nextDouble();
            System.out.print("");
            System.out.print("Quantity: ");
            int pQuantity = in.nextInt();
            System.out.print("");
            Product p = new Product(name, pPrice);
            OrderItem oI = new OrderItem(pQuantity, pPrice, p);
            o.addItem(oI);
               
        }
        
        System.out.println(" ");    
        System.out.println(o.toString());      
        
        in.close();
    }
}
