public class PrecoCredito implements Preco {

    private double preco;

    public PrecoCredito(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaPreco(double valor) {
        return valor * 1.2;
    }
}
