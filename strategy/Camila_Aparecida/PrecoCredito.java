package strategy;

public class PrecoCredito implements Preco {

    public double calculaPreco(double valor) {
        return valor * 1.2;
    }

}
