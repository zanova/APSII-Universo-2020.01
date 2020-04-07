package priceVariance;

import strategyImplementation.Preco;

/**
 *
 * @author Vinícius Trindade
 */
public class PrecoPublico implements Preco {

    private double valor;
    private String tipo = "Publico";

    public PrecoPublico(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
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
