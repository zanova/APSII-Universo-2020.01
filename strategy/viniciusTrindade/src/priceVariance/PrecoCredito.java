package priceVariance;

import strategyImplementation.Preco;

/**
 *
 * @author Vinícius Trindade
 */
public class PrecoCredito implements Preco {

    private double valor;
    private String tipo;

    public PrecoCredito(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
        this.valor *= 1.2;
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
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
