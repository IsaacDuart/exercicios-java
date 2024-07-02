/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidadesEnum.OrderStatus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Duarte
 */
public class Order {
    private OrderStatus status;
    
    private Client client;
    private List<OrderItem> itens = new ArrayList<>();
   
    
    public Order(){
        
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }
    

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        itens.add(item);
    }
    
     public void removeItem(OrderItem item){
        itens.remove(item);
    }
    

    public Double total(){
        double sum = 0.0;
        for(OrderItem n : itens){
           sum += n.subTotal();
        }
        
        return sum;
    }
    
    @Override
           public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Order status: ");
            sb.append(status + "\n");
            sb.append("Client: ");
            sb.append(client + "\n");
            sb.append("Order items: ");
            for(OrderItem ite : itens){
                sb.append(ite + "\n");
            }
              sb.append("Total price: $");     
             sb.append(String.format("%.2f", total()));     
                    
             return sb.toString();
           
        }
         
        }
        
    
    
   

