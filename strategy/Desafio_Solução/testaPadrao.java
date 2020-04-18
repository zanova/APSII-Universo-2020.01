package strategy;

public class testaPadrao {
            
    public static void main(String args[]) {
		
		DeterminaPreco _solucionador = new DeterminaPreco(new PrecoPublico());
        
		double _preco =  4.0;
        
        System.out.println(_solucionador.minimo(_preco));
        
        _solucionador.trocaAlgoritmo(new PrecoVip());
        
        System.out.println(_solucionador.minimo(_preco));
    }
}

