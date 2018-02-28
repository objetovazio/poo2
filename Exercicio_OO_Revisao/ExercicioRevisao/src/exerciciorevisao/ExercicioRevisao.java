/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisao;

import Class.ContaCorrente;

/**
 *
 * @author 20161bsi0349
 */
public class ExercicioRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(100.10);
        
        System.out.println("Tributos relativos a essa conta: " + cc.calculaTributos());
    }
    
}
