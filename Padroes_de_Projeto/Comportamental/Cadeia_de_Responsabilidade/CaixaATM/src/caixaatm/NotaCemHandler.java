package caixaatm;

public class NotaCemHandler extends AbstractSaqueHandler {

    public static final int VALOR = 100;
    public int quantidade = 0;

    @Override
    protected int handleSaque(int valor) {
        int qtd = valor / 100;
        valor -= qtd * 100;
        return valor;
    }

}
