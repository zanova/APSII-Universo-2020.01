package Revistas;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Galileu implements ObserverEditoraAbril {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Notícias da Revista Galileu!!");
    }

}
