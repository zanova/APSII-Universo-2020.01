package atividadestrategy;

public class PrecoCredito implements Preco {

    private double valor;

    public PrecoCredito(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
        this.valor = valor * 1.2;
    }

    @Override
    public double getValor() {
        return this.valor;
    
    }
}

