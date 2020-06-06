package SuperMarioState;

public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegaCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegaFlor() {
        System.out.println("Mario Grande e Mario de Fogo");
       return new MarioDeFogo();
    }

    @Override
    public MarioState pegaPena() {
        System.out.println("Mario Grande e Mario Capa");
        return new MarioDeCapa();
    }

    @Override
    public MarioState levaDano() {
        System.out.println("Mario Morreu");
        return new MarioMorreu();
    }  
}
