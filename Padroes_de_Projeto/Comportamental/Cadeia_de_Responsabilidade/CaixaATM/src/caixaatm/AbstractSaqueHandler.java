/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaatm;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0349
 */
public abstract class AbstractSaqueHandler implements SaqueHandler {

    SaqueHandler saqueHandler;
    
    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.saqueHandler = handler;
    }

    protected abstract double handleSaque(double valor);
    
    @Override
    public void processHander(double valor) {
        valor = handleSaque(valor);
        if (valor > 0) {
            this.saqueHandler.processHander(valor);
        }
    }

    protected abstract String print();
}
