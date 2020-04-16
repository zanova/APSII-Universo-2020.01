package strategy;

public class PrecoCredito implements Preco {

   private double valor;
    private String cliente;

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
    public String getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}