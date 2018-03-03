/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author 20161bsi0349
 */
public class Aeroporto {

    private String cod;
    private String nome;
    private boolean isInternacional;
    private ArrayList<Aeroporto> listaVoosOrigem; // Voos que partem deste aeroporto
    private ArrayList<Aeroporto> listaVoosDestino; // Voos que vêm para este aeroporto
    private ArrayList<Aviao> listaAvioesPousados;

    public Aeroporto(String cod, String nome) {
        this.cod = cod;
        this.nome = nome;
        this.listaVoosOrigem = new ArrayList<>();
        this.listaVoosDestino = new ArrayList<>();
        this.listaAvioesPousados = new ArrayList<>();
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the isInternacional
     */
    public boolean isIsInternacional() {
        return isInternacional;
    }

    /**
     * @param isInternacional the isInternacional to set
     */
    public void setIsInternacional(boolean isInternacional) {
        this.isInternacional = isInternacional;
    }

    /**
     * @return the listaVoosOrigem
     */
    public ArrayList<Aeroporto> getListaVoosOrigem() {
        return listaVoosOrigem;
    }

    /**
     * @param listaVoosOrigem the listaVoosOrigem to set
     */
    public void setListaVoosOrigem(ArrayList<Aeroporto> listaVoosOrigem) {
        this.listaVoosOrigem = listaVoosOrigem;
    }

    /**
     * @return the listaVoosDestino
     */
    public ArrayList<Aeroporto> getListaVoosDestino() {
        return listaVoosDestino;
    }

    /**
     * @param listaVoosDestino the listaVoosDestino to set
     */
    public void setListaVoosDestino(ArrayList<Aeroporto> listaVoosDestino) {
        this.listaVoosDestino = listaVoosDestino;
    }

    /**
     * @return the listaAvioesPousados
     */
    public ArrayList<Aviao> getListaAvioesPousados() {
        return listaAvioesPousados;
    }

    /**
     * @param listaAvioesPousados the listaAvioesPousados to set
     */
    public void setListaAvioesPousados(ArrayList<Aviao> listaAvioesPousados) {
        this.listaAvioesPousados = listaAvioesPousados;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Aeroporto && this.getCod().equals(((Aeroporto) object).getCod());
    }
    
    public boolean isPousado(String prefixo){
        for (Aviao aviao : listaAvioesPousados) {
            if(aviao.getPrefixo().equals(prefixo)) return true;
        }
        
        return false;
    }
    
    public boolean possuiRota(Aeroporto aeroporto){        
        //Caso tenha um voo direto para o aeroporto desejado
        //Retorna True sem necessidade de loop
        if(listaVoosOrigem.contains(aeroporto)) return true;
        
        //Caso exista a possibilidade de escalas para o aeroporto desejado
        //Faz um looping recursivo testando cada possibilidades
        for (Aeroporto escala : aeroporto.getListaVoosDestino()) {
            if(possuiEscala(aeroporto, escala)) return true;
        }
        
        return false;
    }
    
    public boolean possuiEscala(Aeroporto destino, Aeroporto escala){
        for (Aeroporto voo : escala.getListaVoosDestino()) {
            if(voo.getListaVoosDestino().contains(escala)) return true;
            else possuiEscala(destino, voo);
        }
        
        return false;
    }
}
