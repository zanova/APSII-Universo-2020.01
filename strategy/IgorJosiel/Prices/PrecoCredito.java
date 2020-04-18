package strategy;

import PricesStrategy.InterfacePrice;

public class PrecoCredito implements InterfacePrice
{
    private String categoria;
    private double valor;
    
    public PrecoCredito(double valor)
    {
        this.valor = valor;
    }

    @Override
    public void CalcularPreco()
    {
        this.valor *= 1.2;
    }

    @Override
    public double getValor()
    {
        return this.valor;
    }
}
