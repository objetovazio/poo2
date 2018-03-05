/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.Shape;

/**
 *
 * @author 20161bsi0349
 */
public class ShapeFactory {
    
    public static Shape geraShape(String classe){
        Shape shape;
        Object classReflection = null;
        
        try{
            classReflection = Class.forName(classe).newInstance();
        }
        catch(InstantiationException | IllegalAccessException | ClassNotFoundException e){
            e.printStackTrace();
        } 
        
        shape = (Shape)classReflection;
        return shape;
    }
}
