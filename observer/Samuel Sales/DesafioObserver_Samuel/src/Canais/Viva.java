package Canais;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Viva implements ObserverGrupoGlobo {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Canal Viva");
    }

}
