package strategy;
public class PrecoPublico implements Preco {

    private double valor;

    public PrecoPublico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    @Override
    public double calculaPreco(double valor) {
        return valor;
    }
    
}
