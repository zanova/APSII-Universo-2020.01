package atividadestrategy;

public class TrocaTipo {
    
    private final double valor;
    private final String pagamento;
    private Preco valorAPagar;

    
    public TrocaTipo(double valor, String tipo) {
        this.valor = valor;
        this.pagamento = tipo;
    }

    public void escolhaFormaPagamento() {

        if (pagamento.equalsIgnoreCase("PUBLICO")) {
            valorAPagar = new PrecoPublico(this.valor);
            valorAPagar.calculaPreco();
            System.out.println("O valor a pagar: " + valorAPagar.getValor());
        }

        if (pagamento.equalsIgnoreCase("CREDITO")) {
            valorAPagar = new PrecoCredito(this.valor);
            valorAPagar.calculaPreco();
            System.out.println("O valor a pagar: " + valorAPagar.getValor());
        } 
        if (pagamento.equalsIgnoreCase("VIP")){
            valorAPagar = new PrecoVip(this.valor);
            valorAPagar.calculaPreco();
            System.out.println("O valor a pagar: " + valorAPagar.getValor());
        }
    }
}
        
    