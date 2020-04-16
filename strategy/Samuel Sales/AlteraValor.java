/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Samuel Sales - Facul
 */
public class AlteraValor {
    
    private double valor;
    private String cliente;
    private Preco valorNovo;

    public AlteraValor(double valor, String tipo) {
        this.valor = valor;
        this.cliente = tipo;
    }

    public void definePreco() {

        if  (cliente.equalsIgnoreCase("PUBLICO")) {
            valorNovo = new PrecoPublico(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Valor a pagar: " + valorNovo.getValor());
        }

        if  (cliente.equalsIgnoreCase("VIP")) {
            valorNovo = new PrecoVip(this.valor);
            valorNovo.calculaPreco();
           System.out.println("Valor a pagar: " + valorNovo.getValor());
        }

        if  (cliente.equalsIgnoreCase("CREDITO")) {
            valorNovo = new PrecoCredito(this.valor);
            valorNovo.calculaPreco();
            System.out.println("Valor a pagar: " + valorNovo.getValor());
        }
    }
    
}
