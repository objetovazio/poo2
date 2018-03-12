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
public class PizzaStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza pizzaReady = orderPizza("CheesePizza");
        Pizza pizzaReady1 = orderPizza("ClamPizza");
        Pizza pizzaReady2 = orderPizza("PepperoniPizza");
        Pizza pizzaReady3 = orderPizza("VeggiePizza");
        
        
    }
    
    public static Pizza orderPizza(String flavor){
        Pizza pizza;
        pizza = PizzaFactory.createPizza("exercicio_pizza." + flavor);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        System.out.println();
        
        return pizza;
    }
    
}
