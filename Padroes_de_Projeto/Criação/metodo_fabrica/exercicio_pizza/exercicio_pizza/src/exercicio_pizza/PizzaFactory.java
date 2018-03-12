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
public class PizzaFactory {
    
    public static Pizza createPizza(String classe){
        Pizza pizza;
        Object classReflection = null;
        
        try{
            classReflection = Class.forName(classe).newInstance();
        }
        catch(InstantiationException | IllegalAccessException | ClassNotFoundException e){
            e.printStackTrace();
        } 
        
        pizza = (Pizza)classReflection;
        return pizza;
    }
    
}
