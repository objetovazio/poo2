/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente.model;

import lib.ClienteExterno;

/**
 *
 * @author 20161bsi0349
 */
public class AdapterCliente implements ICliente{
    
    ClienteExterno clienteExterno = new ClienteExterno();

    public AdapterCliente(ClienteExterno clienteExterno){
        this.clienteExterno = clienteExterno;
    }
    
    @Override
    public String getNomeCompleto() {
        return clienteExterno.getNome() + " " + clienteExterno.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        String[] nome = nomeCompleto.split(" ");
        this.clienteExterno.setNome(nome[0]);
        
        String sobrenome = "";
        for (int i = 1; i < nome.length; i++) {
            sobrenome += nome[i];
        }
       clienteExterno.setSobreNome(sobrenome);
    }

    @Override
    public String getTelefone() {
        return clienteExterno.getDddTelefone() + " " + clienteExterno.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
         String[] tel = telefone.split(" ");
         
         clienteExterno.setDddTelefone(tel[0]);
         clienteExterno.setTelefone(tel[0]);
    }

    @Override
    public String getEmail() {
        return clienteExterno.getEmail();
    }

    @Override
    public void setEmail(String email) {
        clienteExterno.setEmail(email);
    }

    @Override
    public String getCelular() {
        return clienteExterno.getDddCelular()+ " " + clienteExterno.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        String[] cel = celular.split(" ");
         
         clienteExterno.setDddCelular(cel[0]);
         clienteExterno.setCelular(cel[0]);
    }
    
    
}
