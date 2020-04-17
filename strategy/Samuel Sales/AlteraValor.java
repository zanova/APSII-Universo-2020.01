package strategy;

public class AlteraValor {

    private final double valor;
    private final String cliente;
    private Preco valorNovo;

    public AlteraValor(double valor, String tipo) {
        this.valor = valor;
        this.cliente = tipo;
    }

    public void definePreco() {

        if (cliente.equalsIgnoreCase("PUBLICO")) {
            valorNovo = new PrecoPublico(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Valor a pagar: " + valorNovo.getValor());
        }

        if (cliente.equalsIgnoreCase("CREDITO")) {
            valorNovo = new PrecoCredito(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Valor a pagar: " + valorNovo.getValor());
        } 
        if (cliente.equalsIgnoreCase("VIP")){
            valorNovo = new PrecoVip(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Valor a pagar: " + valorNovo.getValor());
        }
    }

}
