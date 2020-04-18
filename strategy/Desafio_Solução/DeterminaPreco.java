package strategy;

class DeterminaPreco {
    
	private Preco politicaPreco;
        
	public DeterminaPreco(Preco estrat) {
		politicaPreco = estrat;
	}
        
	double minimo(double p) {
		return politicaPreco.algoritmo(p);
	}
        
	void trocaAlgoritmo(Preco novoAlgoritmo) {
		politicaPreco = novoAlgoritmo;
	}
}