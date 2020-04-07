package strategy;

import PricesStrategy.InterfacePrice;

public class PrecoVip implements InterfacePrice
{
    private String categoria;
    private double valor;
    
    public PrecoVip(double valor)
    {
        this.valor = valor;
    }

    @Override
    public void CalcularPreco()
    {
        this.valor *= 0.8;
    }
    
    @Override
    public double getValor()
    {
        return this.valor;
    }

}
