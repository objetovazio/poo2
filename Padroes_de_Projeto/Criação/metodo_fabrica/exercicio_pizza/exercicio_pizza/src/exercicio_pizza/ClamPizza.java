/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_pizza;

/**
 *
 * @author 20161bsi0349
 */
public class ClamPizza extends Pizza {
    public void  bake(){
        System.out.println("Baking " + this.getClass().getSimpleName());
    }
    
    public void prepare(){
        System.out.println("Preparing " + this.getClass().getSimpleName());
    }
     
    public void cut(){
        System.out.println("Cutting " + this.getClass().getSimpleName());
    }
      
    public void box(){
        System.out.println("Boxing " + this.getClass().getSimpleName());
    }
}
