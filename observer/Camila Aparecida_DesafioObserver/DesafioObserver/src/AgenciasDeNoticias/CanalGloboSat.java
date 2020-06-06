package AgenciasDeNoticias;
import Cliente.Agencia;

public class CanalGloboSat implements ObserverNoticias{
    
    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias do Canal Globo Sat!!" );
    }
}
