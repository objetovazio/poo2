
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //constroi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", true);                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", false);       
    }    
}
