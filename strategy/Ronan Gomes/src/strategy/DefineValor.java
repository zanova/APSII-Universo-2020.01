package strategy;
public class DefineValor {
    
    private double valor;
    private String cliente;
    private double valorNovo;

    public DefineValor(double valor, String cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getvalorNovo() {
        return valorNovo;
    }

    public void setvalorNovo(double valorNovo) {
        this.valorNovo = valorNovo;
    }
    
    
    
    
    public void defineTipo(){
        if (this.cliente = "Credito"){
            valorNovo = new PrecoCredito(this.valor);
            this.setValorNovo(this.getValor() * 1.2);
            System.out.println("Valor a pagar é: " +this.getValorNovo());
       }if (this.cliente = "Publico") {
           valorNovo = new PrecoPublico(this.valor);
           this.setValorNovo(this.getValor(valor));
            System.out.println("Valor a pagar é: " + this.getValorNovo());
            
       }if (this.cliente = "Vip") {
           valornovo = new PrecoVip (this.valor);
            this.setValorNovo(this.getValor() * 0.8);
            System.out.println("Valor a pagar é: " + this.getValorNovo());
        }
            
        
    }
           
       
}
