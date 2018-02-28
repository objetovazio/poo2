/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Tributavel;

/**
 *
 * @author 20161bsi0349
 */
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        double tributo = getSaldo() * 0.1;
        return tributo;
    }
    
    
}
