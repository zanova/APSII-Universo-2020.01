package AgenciasDeNoticias;
import Cliente.Agencia;

public class RevistaVoceSA implements ObserverNoticias{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias da Revista Você S/ A!!");
    }  
}
