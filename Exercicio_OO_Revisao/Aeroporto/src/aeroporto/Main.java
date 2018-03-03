/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeroporto;

import Class.Aeroporto;

/**
 *
 * @author 20161bsi0349
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aeroporto aeroporto1 = new Aeroporto("VIX", "Eurico de Aguiar Salles");
        Aeroporto aeroporto2 = new Aeroporto("SDU", "Aeroporto Internacional Tom Jobim");
        Aeroporto aeroporto3 = new Aeroporto("CNF ", "Tancredo Neves");
        
        aeroporto1.getListaVoosOrigem().add(aeroporto2); //VIX > SDU
        
        aeroporto2.getListaVoosOrigem().add(aeroporto3); //SDU > CNF
        aeroporto2.getListaVoosDestino().add(aeroporto3);
        
        aeroporto3.getListaVoosOrigem().add(aeroporto2); //CNF > SDU
        aeroporto3.getListaVoosDestino().add(aeroporto2);
        
        //Mas não é possivel, CNF > VIX (teste)
        
        System.out.println("Possui rota do aeroporto VIX para o SDU? " + aeroporto1.possuiRota(aeroporto2));
        System.out.println("Possui rota do aeroporto VIX para o CNF? " + aeroporto1.possuiRota(aeroporto3));
        
        System.out.println("Possui rota do aeroporto CNF para o SDU? " + aeroporto3.possuiRota(aeroporto2));
        System.out.println("Possui rota do aeroporto CNF para o VIX? " + aeroporto2.possuiRota(aeroporto1));
        
        System.out.println("Possui rota do aeroporto SDU para o VIX? " + aeroporto2.possuiRota(aeroporto1));

    }
    
}
