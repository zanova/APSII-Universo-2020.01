
package PricesStrategy;

import strategy.*;

public class Controlador
{
    private String categoria;
    private double precoProduto;
    private InterfacePrice alternaPreco;

    public Controlador(String categoria, double precoProduto)
    {
        this.categoria = categoria;
        this.precoProduto = precoProduto;
    }

    public void VerificaCategoria()
    {
        if (categoria.equalsIgnoreCase("publico"))
        {
            alternaPreco = new PrecoPublico(precoProduto);
            
            alternaPreco.CalcularPreco();
            
            imprimir();
        }
        
        if (categoria.equalsIgnoreCase("vip"))
        {
            alternaPreco = new PrecoVip(precoProduto);
            
            alternaPreco.CalcularPreco();
            
            imprimir();
        }
        
        if (categoria.equalsIgnoreCase("credito"))
        {
            alternaPreco = new PrecoCredito(precoProduto);
            
            alternaPreco.CalcularPreco();
            
            imprimir();
        }
    }
    
    public void imprimir()
    {
        System.out.println("Categoria: " + categoria + "\nValor: " + alternaPreco.getValor());
    }
}
