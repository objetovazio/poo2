/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaatm;

import java.util.List;

/**
 *
 * @author 20161bsi0349
 */
public interface SaqueHandler {
    public void setNextHandler(SaqueHandler handler);
    public void processHander(int valor);   
}
