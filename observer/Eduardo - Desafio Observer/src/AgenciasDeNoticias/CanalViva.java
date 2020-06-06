package AgenciasDeNoticias;
import Cliente.Agencia;

public class CanalViva implements ObserverNoticias{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+": Notícias do Canal Viva!!");
    }  
}
