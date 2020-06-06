package Canais;
import observer.ObserverNoticias;
import Cliente.Agencia;

public class RevistaSuperInteressante implements ObserverNoticias{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias (SuperInteressante)");
    }   
}
