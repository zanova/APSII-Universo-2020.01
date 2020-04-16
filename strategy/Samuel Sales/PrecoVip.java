package strategy;

public class PrecoVip implements Preco {

   private double valor;
    private String cliente = "VIP";

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
    public String getCliente() {
        return cliente;
    }

    @Override
    public  void setCliente(String cliente) {
        this.cliente = cliente;
    }

}