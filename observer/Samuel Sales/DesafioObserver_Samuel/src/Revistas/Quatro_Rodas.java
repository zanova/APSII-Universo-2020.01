package Revistas;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Quatro_Rodas implements ObserverEditoraAbril {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Revista Quatro Rodas");
    }

}
