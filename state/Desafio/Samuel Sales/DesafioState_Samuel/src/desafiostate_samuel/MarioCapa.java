package desafiostate_samuel;

/**
 *
 * @author Samuel Sales - Facul
 */
public class MarioCapa implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Ganhou 1.000 pontos");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
}
