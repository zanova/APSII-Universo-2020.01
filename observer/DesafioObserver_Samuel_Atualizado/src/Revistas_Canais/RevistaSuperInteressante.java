package Revistas_Canais;

import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class RevistaSuperInteressante implements ObserverNoticias {

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome() + ": Revista SuperInteressante");
    }
}
