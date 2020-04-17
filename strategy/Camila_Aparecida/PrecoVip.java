package strategy;

public class PrecoVip implements Preco {

    public double calculaPreco(double valor) {
        return valor * 0.8;
    }

}
