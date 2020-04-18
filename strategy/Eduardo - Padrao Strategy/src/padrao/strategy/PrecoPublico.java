package padrão.strategy;
/**
 *
 * @author Eduardo
 */
public class PrecoPublico implements Preco {

    final private double valor;
    private String cliente = "Publico";

    public PrecoPublico(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaPreco() {
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
