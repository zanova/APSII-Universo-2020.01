package strategy;

import PricesStrategy.InterfacePrice;

public class PrecoPublico implements InterfacePrice
{
    private String categoria;
    private double valor;
    
    public PrecoPublico(double valor)
    {
        this.valor = valor;
    }

    @Override
    public void CalcularPreco()
    {
        this.valor = this.valor;
    }
    
    @Override
    public double getValor()
    {
        return this.valor;
    }
}
