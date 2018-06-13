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
public class Semaforo {
    private RedLight redLight = new RedLight(30);
    private YellowLight yellowLight = new YellowLight(3);
    private GreenLight greenLight = new GreenLight(60);
    private StateSemaforo currentState;
    
    public void setupSemaforo(){
        redLight.setNextState(yellowLight);
        yellowLight.setNextState(greenLight);
        greenLight.setNextState(redLight);
        currentState = redLight;
    }

    /**
     * @return the currentState
     */
    public StateSemaforo getCurrentState() {
        return currentState;
    }

    public void goNextState() {
        this.currentState = this.currentState.getNextState();
    }
    
    public void iniciaSemaforo(){
        while(true){
            this.currentState.doAction();
            
            if(currentState.finishState()) goNextState();
        }
    }
}
