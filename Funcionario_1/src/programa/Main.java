/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import entidades.Company;
import entidades.Individual;
import entidades.TaxPayer;
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
        
        System.out.print("Enter the number of tax payers: ");
        int n = in.nextInt();
        System.out.print("");
        
        List<TaxPayer> taxPayer= new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            
            System.out.print("Individual or Company (i/c)? ");
            char type = in.next().charAt(0);
            System.out.print("");
            
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("");
            
            System.out.print("Anual Income: ");
            double anualIncome = in.nextDouble();
            System.out.print("");
            
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = in.nextDouble();
                System.out.print("");
                taxPayer.add(new Individual(healthExpenditures, name, anualIncome));
            } else if(type == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = in.nextInt();
                System.out.print("");
                taxPayer.add(new Company(numberOfEmployees, name, anualIncome));
            }
            
            
            }
            
         System.out.println("");
            System.out.println("TAXES PAID: ");
            
            double sum = 0.0;
            for(TaxPayer p : taxPayer){
                double tax = p.tax();
                System.out.println(p.getName() + ": $ " + tax);
                sum += tax;
        }
           
           System.out.println("");         
           System.out.println("TOTAL TAXES: $ " + sum);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        in.close();
    }
}
