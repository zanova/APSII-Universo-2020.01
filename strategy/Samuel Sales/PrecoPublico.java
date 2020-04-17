package strategy;

public class PrecoPublico implements Preco {

    final private double valor;

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
}
