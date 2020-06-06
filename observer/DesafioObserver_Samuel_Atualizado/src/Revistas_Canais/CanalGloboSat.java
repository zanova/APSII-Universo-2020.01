package Revistas_Canais;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class CanalGloboSat implements ObserverNoticias {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Canal Globo Sat");
    }
}
