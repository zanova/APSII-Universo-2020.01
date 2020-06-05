package Revistas;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Voce_SA implements ObserverEditoraAbril {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Revista Você S.A");
    }

}
