package desafiostate_samuel;

/**
 *
 * @author Samuel Sales - Facul
 */
public class MarioGrande implements MarioState {

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Capa");
        return new MarioCapa();
    }

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Ganhou 1.000 pontos");
        return this;
    }

}
