public class PrecoVip implements Preco {

    private double preco;

    public PrecoVip(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaPreco(double valor) {
        return valor * 0.8;
    }
}
