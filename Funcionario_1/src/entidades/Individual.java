/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Isaac Duarte
 */
public class Individual extends TaxPayer{
    private Double healthExpenditures;
    
    public Individual(){
        
    }

    public Individual(Double healthExpenditures, String name, Double anualIncome) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    
    
    @Override
    public double tax() {
        
        if(anualIncome < 20000){
            return (anualIncome * 0.15) - (healthExpenditures * 0.5);
        } else if(anualIncome > 20000){
            return (anualIncome * 0.25) - (healthExpenditures * 0.5);
        
       
    }
        return 0;

   
    }
}
    

