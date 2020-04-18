package strategyImplementation;

import priceVariance.*;

/**
 *
 * @author Vinícius Trindade
 */
public class TrocarPreco {

    private double valor;
    private String tipo;
    private Preco precoVariacao;

    public TrocarPreco(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public void definePreco() {

        if  (tipo.equalsIgnoreCase("PUBLICO")) {
            precoVariacao = new PrecoPublico(this.valor);
            precoVariacao.calculaPreco();
            System.out.println("Cliente: " + tipo + " valor a pagar: " + precoVariacao.getValor());
        }

        if  (tipo.equalsIgnoreCase("VIP")) {
            precoVariacao = new PrecoVip(this.valor);
            precoVariacao.calculaPreco();
            System.out.println("Cliente: " + tipo + " valor a pagar: " + precoVariacao.getValor());
        }

        if  (tipo.equalsIgnoreCase("CREDITO")) {
            precoVariacao = new PrecoCredito(this.valor);
            precoVariacao.calculaPreco();
            System.out.println("Cliente: " + tipo + " valor a pagar: " + precoVariacao.getValor());
        }
    }
}
