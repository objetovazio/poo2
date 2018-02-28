/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author 20161bsi0349
 */
public class Aviao {
    private String prefixo;
    private String modelo;
    private String fabricante;
    private int totalAssentos;
    private int assentosOcupados;

    /**
     * @return the prefixo
     */
    public String getPrefixo() {
        prefixo = String.format("%s %s %d", modelo, fabricante, totalAssentos);
        return prefixo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the totalAssentos
     */
    public int getTotalAssentos() {
        return totalAssentos;
    }

    /**
     * @param totalAssentos the totalAssentos to set
     */
    public void setTotalAssentos(int totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    /**
     * @return the assentosOcupados
     */
    public int getAssentosOcupados() {
        return assentosOcupados;
    }

    /**
     * @param assentosOcupados the assentosOcupados to set
     */
    public void setAssentosOcupados(int assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }
    
}
