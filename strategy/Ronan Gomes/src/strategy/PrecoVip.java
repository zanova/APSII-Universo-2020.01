package strategy;
public class PrecoVip implements Preco {
    
    private double valor;

    public PrecoVip(double valor) {
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
        return valor * 0.8;
    }
    
}
