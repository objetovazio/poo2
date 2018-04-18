
import example.hibernate.model.Usuario;
import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.UsuarioDAO;
import example.hibernate.persistencia.UsuarioDAOImpl;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        VeiculoDAO veiculoDAO = new VeiculoDAOImpl();
        Veiculo veiculo = new Veiculo();
        veiculo.setAno("2010");
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Uno");
        veiculo.setQuilometragem("1000");
        veiculo.setTipo("carro");

        List lista = veiculoDAO.buscaVeiculosApartirDoAno(2009);

        veiculoDAO.inserir(veiculo);
        List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
        for (Veiculo printVeiculo : listar) {
            System.out.println(printVeiculo.toString());
        }

        veiculoDAO.deletar(veiculo);
        listar = veiculoDAO.listar(Veiculo.class);
        for (Veiculo printVeiculo : listar) {
            System.out.println(printVeiculo.toString());
        }

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        Usuario usuario = new Usuario();
        usuario.setLogin("andre.martins");
        usuario.setSenha("andre.martins");
        usuario.setNome("André Martins");
        usuario.setEmail("andre.martins@ifes.com.br");

        usuarioDAO.inserir(usuario);

        System.out.println(usuario.toString());
        usuario = usuarioDAO.buscaUsuárioPorNomeESenha("andre.martins", "andre.martins");

        if (usuario != null) System.out.println(usuario.toString());
        else System.out.println("Usuario Nulo");    
        
        usuarioDAO.deletar(usuario);
        

    }
}
