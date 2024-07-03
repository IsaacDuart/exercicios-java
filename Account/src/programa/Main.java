/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import entidades.Account;
import exceptions.DomainException;
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
          
            try{
            System.out.println("Enter account data");
            
            System.out.print("Number: ");
            int number = in.nextInt();
            System.out.print("");
            
            System.out.print("Holder: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("");
            
            System.out.print("Initial balance: ");
            double balance = in.nextDouble();
            System.out.print("");
            
            System.out.print("Withdraw limit: ");
            double withdrawLimit = in.nextDouble();
            System.out.print("");
            
            Account a1 = new Account(number, name, balance, withdrawLimit);

            System.out.println("");
            
            System.out.print("Enter amount for withdraw: ");
            double amount = in.nextDouble();
            System.out.print("");
            
            a1.withdraw(amount);
            
            System.out.println("New Balance: " + a1.getBalance());
            }
            
            catch(DomainException e){
                System.out.println("Withdraw error: " + e.getMessage());
            }
            
        
        
        
        
        
         
     
        
       in.close(); 
    }
}
