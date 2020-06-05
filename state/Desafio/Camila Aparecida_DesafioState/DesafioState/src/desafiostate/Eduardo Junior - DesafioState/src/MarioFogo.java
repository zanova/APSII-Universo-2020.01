public class MarioFogo implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Fogo");
        return this; 
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }   
}