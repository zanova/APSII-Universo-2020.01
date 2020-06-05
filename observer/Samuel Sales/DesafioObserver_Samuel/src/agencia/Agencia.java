package agencia;

import java.util.ArrayList;
import java.util.List;
import Canais.*;
import Revistas.*;

/**
 *
 * @author Samuel Sales - Facul
 */
public class Agencia {

    private static final List<ObserverEditoraAbril> observadorEditoraAbril = new ArrayList<ObserverEditoraAbril>();
    private static final List<ObserverGrupoGlobo> observadorGrupoGlobo = new ArrayList<ObserverGrupoGlobo>();

    private String nome;

    public Agencia(String nome) {
        this.nome = nome;
    }

    public Agencia obterEstadoEditoraAbril() {
        return this;
    }

    public Agencia obterEstadoGrupoGlobo() {
        return this;
    }

    public void salvarEstadoEditoraAbril() {
        this.notificarEditoraAbril();
    }

    public void salvarEstadoGrupoGlobo() {
        this.notificarGrupoGlobo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void anexarEditoraAbril(ObserverEditoraAbril observer) {
        Agencia.observadorEditoraAbril.add(observer);
    }

    public static void anexarGrupoGlobo(ObserverGrupoGlobo observer) {
        Agencia.observadorGrupoGlobo.add(observer);
    }

    public static void desanexarEditoraAbril(ObserverEditoraAbril observer) {
        Agencia.observadorEditoraAbril.remove(observer);
    }

    public static void desanexarGrupoGlobo(ObserverGrupoGlobo observer) {
        Agencia.observadorGrupoGlobo.remove(observer);
    }

    public void notificarEditoraAbril() {
        ObserverEditoraAbril ob;

        for (int i = 0; i < this.observadorEditoraAbril.size(); i++) {
            ob = this.observadorEditoraAbril.get(i);
            ob.atualizar(this);
        }
    }

    public void notificarGrupoGlobo() {
        ObserverGrupoGlobo ob2;

        for (int i = 0; i < this.observadorGrupoGlobo.size(); i++) {
            ob2 = this.observadorGrupoGlobo.get(i);
            ob2.atualizar(this);
        }
    }
}
