/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Isaac Duarte
 */
public class ImportedProduct extends Product{
    private Double customsFee;
    
    public ImportedProduct(){
        
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return price += customsFee;
    }
    
    @Override
    public final String priceTag(){
       return name +
              " $ " + totalPrice()
               + "(Customs fee: $ " 
               + customsFee 
               + ")";
       
    }
}
