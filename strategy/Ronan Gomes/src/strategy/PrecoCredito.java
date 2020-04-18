package strategy;
public class PrecoCredito implements Preco {
    
    private double valor;

    public PrecoCredito(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    @Override
    public double calculaPreco(double valor){
        return valor * 1.2;
    }
}
