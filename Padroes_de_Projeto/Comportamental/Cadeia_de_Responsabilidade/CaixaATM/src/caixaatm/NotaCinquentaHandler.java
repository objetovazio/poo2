package caixaatm;

public class NotaCinquentaHandler extends AbstractSaqueHandler {

    public static final int VALOR = 50;
    public int quantidade = 0;

    @Override
    protected double handleSaque(double valor) {
       int qtd = (int) (valor / this.VALOR);
        double valorRestante = 0;
        
        valorRestante = valor -(qtd * this.VALOR);
        this.quantidade += qtd;
        
        return valorRestante;
    }
    
  @Override
    protected String print() {
        if(quantidade > 0) return "Nota " + this.VALOR + ": " + quantidade + "\n";
        return "";
    }


}
