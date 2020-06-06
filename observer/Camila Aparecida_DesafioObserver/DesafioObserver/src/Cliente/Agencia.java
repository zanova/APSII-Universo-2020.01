package Cliente;

import java.util.ArrayList;
import java.util.List;
import AgenciasDeNoticias.*;


public class Agencia{
    
    static private List<ObserverNoticias> observadoresDeNoticias = new ArrayList<ObserverNoticias>();
    
    private String nome;

    public Agencia(String nome) {
        this.nome = nome;
    }

    public static void anexar(ObserverNoticias observer) {
        Agencia.observadoresDeNoticias.add(observer);   
    }

    public static void desanexar(ObserverNoticias observer) {
        Agencia.observadoresDeNoticias.remove(observer);   
    }
    
    public void notificarNoticias() {
        ObserverNoticias ob; 

        for (int i = 0; i < this.observadoresDeNoticias.size(); i++) {   
            ob = this.observadoresDeNoticias.get(i);    
            ob.atualizar(this);  
        }
    }
   
    public Agencia obterEstado() {
        return this;
    }
     
    public void salvarEstado() {
        this.notificarNoticias();
    }      
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
}
