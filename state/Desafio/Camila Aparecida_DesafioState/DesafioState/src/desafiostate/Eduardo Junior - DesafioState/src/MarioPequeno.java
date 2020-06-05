public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario Grande e Mario Fogo");
       return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario Grande e Mario Capa");
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Morto");
        return new MarioMorto();
    }  
}