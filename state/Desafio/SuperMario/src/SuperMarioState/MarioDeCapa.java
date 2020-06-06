package SuperMarioState;

public class MarioDeCapa implements MarioState {

    
    @Override
    public MarioState pegaCogumelo() {
        System.out.println("1000 pts");
        return this;
    }

    
    @Override
    public MarioState pegaFlor() {
        System.out.println("Mario de Fogo");
        return new MarioDeFogo();
    }

    
    
    @Override
    public MarioState pegaPena() {
        System.out.println("1000 pts");
        return this;
    }

    
    
    @Override
    public MarioState levaDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }  
}
