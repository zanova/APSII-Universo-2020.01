/**
 *
 * @author Eduardo
 */

package desafioobserver;
import Cliente.Agencia;
import AgenciasDeNoticias.*;

public class Principal {

    public static void main(String[] args) {
        
        RevistaGalileu galileu = new RevistaGalileu();
        RevistaQuatroRodas quatroRodas = new RevistaQuatroRodas();
        RevistaSuperInteressante superInteressante = new RevistaSuperInteressante();
        RevistaVeja veja = new RevistaVeja();
        RevistaVoceSA voceSA = new RevistaVoceSA();
        
        CanalGlobo globo = new CanalGlobo();
        CanalGloboSat globoSat = new CanalGloboSat();
        CanalViva viva = new CanalViva();
          
        Agencia.anexarEditoraAbril(galileu);
	Agencia.anexarEditoraAbril(quatroRodas);
        Agencia.anexarEditoraAbril(superInteressante);
        Agencia.anexarEditoraAbril(veja);
        Agencia.anexarEditoraAbril(voceSA);
        Agencia.anexarGrupoGlobo(globo);
        Agencia.anexarGrupoGlobo(globoSat);
        Agencia.anexarGrupoGlobo(viva);
        
        
        Agencia vaiQueDa = new Agencia ("Agencia VaiQueDa");
        vaiQueDa.salvarEstadoEditoraAbril();
        System.out.println("\n\n");
        
        
        Agencia universo = new Agencia ("Agencia Universo");
        universo.salvarEstadoGrupoGlobo();
        System.out.println("\n\n");
        
        Agencia gov = new Agencia("Agencia do Governo");
        gov.salvarEstadoEditoraAbril();
        gov.salvarEstadoGrupoGlobo();
        System.out.println("\n\n");
        
        
        Agencia sistemas = new Agencia ("Agencia Sistemas");
        
        Agencia.desanexarEditoraAbril(galileu);
        Agencia.desanexarEditoraAbril(quatroRodas);
        Agencia.desanexarEditoraAbril(superInteressante);
        Agencia.desanexarEditoraAbril(voceSA);
      
        sistemas.salvarEstadoEditoraAbril();
        
        Agencia.desanexarGrupoGlobo(globoSat);
        Agencia.desanexarGrupoGlobo(globoSat);
        Agencia.desanexarGrupoGlobo(viva);
        
        sistemas.salvarEstadoGrupoGlobo();
        
        System.out.println("\n");
       
    }   
}
