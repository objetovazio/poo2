/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hibernate.persistencia;

import example.hibernate.model.Usuario;

/**
 *
 * @author 20161bsi0349
 */
public interface UsuarioDAO extends GenericDAO<Usuario>{
    public Usuario buscaUsuárioPorNomeESenha(String usuario, String senha);
}
