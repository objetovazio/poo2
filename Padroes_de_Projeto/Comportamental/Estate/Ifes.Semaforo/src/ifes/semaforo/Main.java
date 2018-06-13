/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.semaforo;
    
import java.util.Timer;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo semaforo = new Semaforo();
        
        semaforo.setupSemaforo();
        semaforo.iniciaSemaforo();
    }
    
}
