package Revistas;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Veja implements ObserverEditoraAbril {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Revista Veja");
    }

}
