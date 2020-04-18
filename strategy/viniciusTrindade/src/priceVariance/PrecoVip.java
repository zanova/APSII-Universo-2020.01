package priceVariance;

import strategyImplementation.Preco;

/**
 *
 * @author Vinícius Trindade
 */
public class PrecoVip implements Preco {

    private double valor;
    private String tipo = "VIP";

    public PrecoVip(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
        this.valor *= 0.8;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public  void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
