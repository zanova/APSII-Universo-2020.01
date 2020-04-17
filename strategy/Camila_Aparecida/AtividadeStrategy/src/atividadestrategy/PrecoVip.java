package atividadestrategy;

public class PrecoVip implements Preco {

    private double valor;

    public PrecoVip(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
        this.valor = valor * 0.8;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
