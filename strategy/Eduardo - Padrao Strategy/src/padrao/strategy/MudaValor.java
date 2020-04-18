package padrão.strategy;
/**
 *
 * @author Eduardo
 */
public class MudaValor {
        
    private double valor;
    private String cliente;
    private Preco valorNovo;

    public MudaValor(double valor, String tipo) {
        this.valor = valor;
        this.cliente = tipo;
    }

    public void definePreco() {

        if  (cliente.equalsIgnoreCase("PUBLICO")) {
            valorNovo = new PrecoPublico(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Tipo de cliente: " + cliente + " Novo valor a pagar: " + valorNovo.getValor());
        }

        if  (cliente.equalsIgnoreCase("VIP")) {
            valorNovo = new PrecoVip(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Tipo de cliente: " + cliente + " Novo valor a pagar: " + valorNovo.getValor());
        }

        if  (cliente.equalsIgnoreCase("CREDITO")) {
            valorNovo = new PrecoCredito(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Tipo de cliente: " + cliente + " Novo valor a pagar: " + valorNovo.getValor());
        }
    }
}
