package strategy;

public class ControlaValor {
        private String cliente;
        private double valor;
        private Preco NovoValor;
		
        public ControlaValor(String cliente, double valor) {
			this.cliente = cliente;
			this.valor = valor;
			}
        
        public void mudaPreco() {
        	
        	if(cliente.equalsIgnoreCase("Publico")){
        		NovoValor = new PrecoPublico(this.valor);
        		NovoValor.calculaPreco();
        		System.out.println("Valor:" + NovoValor.getValor() );
        	}
        	if(cliente.equalsIgnoreCase("Credito")) {
        		NovoValor = new PrecoCredito(this.valor);
        		NovoValor.calculaPreco();    
        		System.out.println("Valor:" + NovoValor.getValor() );
        	}
        	if(cliente.equalsIgnoreCase("VIP")) {
        		NovoValor = new PrecoVip(this.valor);
        		NovoValor.calculaPreco();
        		System.out.println("Valor:" + NovoValor.getValor() );
        	}
        }

		
           
        
        
}
