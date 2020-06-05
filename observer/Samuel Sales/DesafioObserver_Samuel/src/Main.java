
import Canais.*;
import Revistas.*;
import agencia.Agencia;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Main {

    public static void main(String[] args) {

        Globo globo = new Globo();
        GloboSat globoSat = new GloboSat();
        Viva viva = new Viva();

        Galileu galileu = new Galileu();
        Quatro_Rodas quatro_Rodas = new Quatro_Rodas();
        SuperInteressante superInteressante = new SuperInteressante();
        Veja veja = new Veja();
        Voce_SA voce_SA = new Voce_SA();

        Agencia.anexarGrupoGlobo(globo);
        Agencia.anexarGrupoGlobo(globoSat);
        Agencia.anexarGrupoGlobo(viva);
        Agencia.anexarEditoraAbril(galileu);
        Agencia.anexarEditoraAbril(quatro_Rodas);
        Agencia.anexarEditoraAbril(superInteressante);
        Agencia.anexarEditoraAbril(veja);
        Agencia.anexarEditoraAbril(voce_SA);
        
        System.out.println("--- Agências e seus Canais / Revistas assinados --- \n\n");

        Agencia vaiQueDa = new Agencia("Agência VaiQueDa");
        vaiQueDa.salvarEstadoEditoraAbril();
        System.out.println("\n");

        Agencia universo = new Agencia("Agência Universo");
        universo.salvarEstadoGrupoGlobo();
        System.out.println("\n");

        Agencia gov = new Agencia("Agência do GOV");
        gov.salvarEstadoEditoraAbril();
        gov.salvarEstadoGrupoGlobo();
        System.out.println("\n");

        Agencia sistemas = new Agencia("Agência Sistemas");

        Agencia.desanexarEditoraAbril(galileu);
        Agencia.desanexarEditoraAbril(quatro_Rodas);
        Agencia.desanexarEditoraAbril(superInteressante);
        Agencia.desanexarEditoraAbril(voce_SA);

        sistemas.salvarEstadoEditoraAbril();

        Agencia.desanexarGrupoGlobo(globoSat);
        Agencia.desanexarGrupoGlobo(globoSat);
        Agencia.desanexarGrupoGlobo(viva);

        sistemas.salvarEstadoGrupoGlobo();
    }
}
