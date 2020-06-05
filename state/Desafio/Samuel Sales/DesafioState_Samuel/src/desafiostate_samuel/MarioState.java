package desafiostate_samuel;

/**
 *
 * @author Samuel Sales - Facul
 */
public interface MarioState {

    MarioState pegarCogumelo();

    MarioState pegarFlor();

    MarioState pegarPena();

    MarioState levarDano();
}
