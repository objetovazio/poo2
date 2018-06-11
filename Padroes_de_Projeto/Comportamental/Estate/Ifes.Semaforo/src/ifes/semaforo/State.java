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
public abstract class State {
    State nextState;
    
    public abstract void doAction();
    
    public State getNextState(){
        return this.nextState;
    }
    
    public void setNextState(State state){
        this.nextState = state;
    }
    
    
}
