public class PrecoPublico implements Preco {

    private double preco;

    public PrecoPublico(double preco) {
        this.preco = preco;
    }

    @Override
    public double calculaPreco(double valor) {
        return valor;
    }
}
