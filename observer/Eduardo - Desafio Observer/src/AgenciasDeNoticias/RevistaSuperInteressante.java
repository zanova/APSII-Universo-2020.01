package AgenciasDeNoticias;
import Cliente.Agencia;

public class RevistaSuperInteressante implements ObserverEditoraAbril{

    @Override
    public void atualizar(Agencia entrada) {
        System.out.println(entrada.getNome()+ ": Notícias da Revista SuperInteressante!!");
    }   
}
