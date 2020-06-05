package Cliente;

import java.util.ArrayList;
import java.util.List;
import AgenciasDeNoticias.*;


public class Agencia{
    
    static private List<ObserverEditoraAbril> observadoresEditoraAbril = new ArrayList<ObserverEditoraAbril>();
    static private List<ObserverGrupoGlobo> observadoresGrupoGlobo = new ArrayList<ObserverGrupoGlobo>();
    
    private String nome;

    public Agencia(String nome) {
        this.nome = nome;
    }
    
    //Anexar da Editora Abril
    public static void anexarEditoraAbril(ObserverEditoraAbril observer) {
        Agencia.observadoresEditoraAbril.add(observer);   
    }
    
    //Anexar do Grupo Globo
    public static void anexarGrupoGlobo(ObserverGrupoGlobo observer) {
        Agencia.observadoresGrupoGlobo.add(observer);
    }
    
    //Desanexar da Editora Abril
    public static void desanexarEditoraAbril(ObserverEditoraAbril observer) {
        Agencia.observadoresEditoraAbril.remove(observer);   
    }
    
    //Desanexar do Grupo Globo
    public static void desanexarGrupoGlobo(ObserverGrupoGlobo observer) {
       Agencia.observadoresGrupoGlobo.remove(observer);
    }
    
    //Notificar da Editora Abril
    public void notificarEditoraAbril() {
        ObserverEditoraAbril ob; 

        for (int i = 0; i < this.observadoresEditoraAbril.size(); i++) {   
            ob = this.observadoresEditoraAbril.get(i);    
            ob.atualizar(this);  
        }
    }
    
    //Notificar do Grupo globo
    public void notificarGrupoGlobo() {
        ObserverGrupoGlobo ob2; 

        for (int i = 0; i < this.observadoresGrupoGlobo.size(); i++) {
            ob2 = this.observadoresGrupoGlobo.get(i);   
            ob2.atualizar(this);  
        }
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
}
