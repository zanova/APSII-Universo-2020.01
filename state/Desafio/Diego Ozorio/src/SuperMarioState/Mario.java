package SuperMarioState;

public class Mario {
    
    protected MarioState estado;
     
    public Mario() 
    {
        estado = new MarioPequeno();
    }
 
    public void pegaCogumelo() 
    {
        estado = estado.pegaCogumelo();
    }
 
    public void pegaFlor() 
    {
        estado = estado.pegaFlor();
    }
 
    public void pegaPena() 
    {
        estado = estado.pegaPena();
    }
 
    public void levaDano() 
    {
        estado = estado.levaDano();
    }
}
