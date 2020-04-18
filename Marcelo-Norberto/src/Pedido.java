public class Pedido {

    private String tipoDePedido;
    private double preco;

    public Pedido(String tipoDePedido, double preco) {
        this.tipoDePedido = tipoDePedido;
        this.preco = preco;
    }

    public String getTipoDePedido() {
        return tipoDePedido;
    }

    public double getPreco() {
        return preco;
    }
}
