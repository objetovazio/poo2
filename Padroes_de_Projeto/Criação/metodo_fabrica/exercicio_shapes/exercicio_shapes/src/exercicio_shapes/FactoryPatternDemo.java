/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_shapes;

import Classes.ShapeFactory;
import Interfaces.Shape;

/**
 *
 * @author 20161bsi0349
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape shape;
        shape = ShapeFactory.geraShape("Classes.Circle");
        shape.draw();
        
        shape = ShapeFactory.geraShape("Classes.Square");
        shape.draw();
        
        shape = ShapeFactory.geraShape("Classes.Triangle");
        shape.draw();
    }
    
}
