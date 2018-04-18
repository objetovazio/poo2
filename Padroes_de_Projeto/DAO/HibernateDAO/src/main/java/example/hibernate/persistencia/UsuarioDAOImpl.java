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
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO{

    public Usuario buscaUsuárioPorNomeESenha(String usuario, String senha) {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            Usuario user = (Usuario)sessao.createQuery("from Usuario where login like '" + usuario + "' and senha like '" + senha + "'").uniqueResult();
            transacao.commit();            
            sessao.close();
            return user;
    }
    
}
