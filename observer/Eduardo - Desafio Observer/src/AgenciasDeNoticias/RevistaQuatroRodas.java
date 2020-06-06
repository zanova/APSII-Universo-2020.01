package AgenciasDeNoticias;
import Cliente.Agencia;

public class RevistaQuatroRodas implements ObserverNoticias{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias da Revista Quatro Rodas!!");
    }   
}
