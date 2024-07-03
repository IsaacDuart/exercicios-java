/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Isaac Duarte
 */
public class Company extends TaxPayer {
 
    private int numberOfEmployees;
    
    public Company(){
        
    }

    public Company(int numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
    
    
    @Override
    public double tax() {
       
        if(numberOfEmployees <= 10){
        return anualIncome * 0.16;
        } else if(numberOfEmployees > 10){
            return anualIncome * 0.14;
        }
        return 0;
        
    }
}
        
    

