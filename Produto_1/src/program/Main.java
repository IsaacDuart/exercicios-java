/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import entidades.ImportedProduct;
import entidades.Product;
import java.util.ArrayList;
import java.util.List;
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
        
        System.out.print("Enter the number of products: ");
        int n = in.nextInt();
        System.out.print("");
        
        List<Product> products = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common or Imported (c/i)? ");
            char type = in.next().charAt(0);
            System.out.print("");
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("");
            System.out.print("Price: ");
            double price = in.nextDouble();
            System.out.print("");
            if(type == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = in.nextDouble();
                 System.out.print("");
                 products.add(new ImportedProduct(customsFee, name, price));
            } else if(type == 'c'){
                products.add(new Product(name, price));
            }
            
        }
        
         System.out.println(" ");
         System.out.println("PRICE TAGS: ");
         for(Product p : products){
             System.out.println(p.priceTag());
         }
        
        
        
        
        
        
        
        in.close();
    }
}
