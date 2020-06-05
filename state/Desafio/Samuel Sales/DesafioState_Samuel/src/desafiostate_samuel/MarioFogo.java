package desafiostate_samuel;

/**
 *
 * @author Samuel Sales - Facul
 */
public class MarioFogo implements MarioState {

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Fogo");
        return this;
    }

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Ganhou 1.000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Ganhou 1.000 pontos");
        return this;
    }

}
