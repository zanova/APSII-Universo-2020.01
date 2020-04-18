public class ProcessamentoDoPedido {

    protected Pedido pedido;

    public ProcessamentoDoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void calculaPreco() {
        Preco preco = null;
        if (pedido.getTipoDePedido().equalsIgnoreCase("publico")) {
            preco = new PrecoPublico(pedido.getPreco());
        }
        if (pedido.getTipoDePedido().equalsIgnoreCase("credito")) {
            preco = new PrecoCredito(pedido.getPreco());
        }
        if (pedido.getTipoDePedido().equalsIgnoreCase("vip")) {
            preco = new PrecoVip(pedido.getPreco());
        }
        System.out.printf("Tipo do clinte: %s \nPreço: %.2f \nPreço final: %.2f", pedido.getTipoDePedido(), pedido.getPreco(), preco.calculaPreco(pedido.getPreco()));
        System.out.println("\n=====================================");
    }
}
