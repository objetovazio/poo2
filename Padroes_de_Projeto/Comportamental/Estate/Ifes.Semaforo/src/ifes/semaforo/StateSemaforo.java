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
public abstract class StateSemaforo {

    StateSemaforo nextState;

    public int timeInterval;
    public long timeCount;
    public Long startTime = null;

    public StateSemaforo(int ti) {
        this.timeInterval = ti;
        this.timeCount = 0;
    }

    public abstract void doAction();

    public StateSemaforo getNextState() {
        this.timeCount = 0;
        this.startTime = null;
        return this.nextState;
    }

    public void setNextState(StateSemaforo state) {
        this.nextState = state;
    }

    public void setStartTime() {
        if (startTime == null) {
            startTime = System.nanoTime();
            startTime = startTime / 1000000000;
        }
    }

    public void updateCurrentTime() {
        timeCount = System.nanoTime();
        timeCount = timeCount / 1000000000;
    }

    public long currentTime() {
        return timeInterval - (timeCount - startTime);
    }

    public boolean finishState() {
        if (currentTime() == 0) {
            return true;
        }

        return false;
    }

    public String colorReset() {
        return "\u001B[0m";
    }

    public abstract String lightColor();
}
