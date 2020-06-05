package Canais;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class GloboSat implements ObserverGrupoGlobo {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Canal Globo Sat");
    }

}
