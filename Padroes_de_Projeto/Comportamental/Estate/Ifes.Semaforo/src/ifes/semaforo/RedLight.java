/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.semaforo;


/**
 *
 * @author andre
 */
public class RedLight extends StateSemaforo{

    public RedLight(int ti) {
        super(ti);
    }
    
    @Override
    public void doAction() {
        setStartTime();
        updateCurrentTime();
        System.out.println(lightColor() + "Semáforo vermelho: " + (currentTime()) + this.colorReset());
    }

    @Override
    public String lightColor() {
        return "\u001B[31m";
    }
}
