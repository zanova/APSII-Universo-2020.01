package Canais;
import observer.ObserverNoticias;
import Cliente.Agencia;

public class RevistaQuatroRodas implements ObserverNoticias{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias (Quatro Rodas)");
    }   
}
