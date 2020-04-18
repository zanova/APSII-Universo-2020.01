package strategyImplementation;

/**
 *
 * @author Vinícius Trindade
 */
public interface Preco {

    public abstract void calculaPreco();

    public abstract double getValor();

    public abstract String getTipo();

    public abstract  void setTipo(String tipo);
}
