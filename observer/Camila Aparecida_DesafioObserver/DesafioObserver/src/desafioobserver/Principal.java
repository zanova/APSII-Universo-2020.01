package desafioobserver;

import AgenciasDeNoticias.*;
import Cliente.Agencia;

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
          
       
        Agencia vaiQueDa = new Agencia ("Agencia VaiQueDa");
        
        Agencia.anexar(galileu);
	Agencia.anexar(quatroRodas);
        Agencia.anexar(superInteressante);
        Agencia.anexar(veja);
        Agencia.anexar(voceSA);
        
        Agencia.desanexar(globoSat);
        Agencia.desanexar(globo);
        Agencia.desanexar(viva);
        
        vaiQueDa.salvarEstado();
        System.out.println("\n");
          
        
        Agencia universo = new Agencia ("Agencia Universo");
        Agencia.anexar(globo);
        Agencia.anexar(globoSat);
        Agencia.anexar(viva);
             
        Agencia.desanexar(galileu); 
        Agencia.desanexar(quatroRodas);
        Agencia.desanexar(superInteressante);       
        Agencia.desanexar(voceSA);
        Agencia.desanexar(veja);
        
        universo.salvarEstado();
        System.out.println("\n");
        
        
        Agencia gov = new Agencia("Agencia do Governo");
        
        
        Agencia.anexar(galileu);
	Agencia.anexar(quatroRodas);
        Agencia.anexar(superInteressante);
        Agencia.anexar(veja);
        Agencia.anexar(voceSA);
        
        gov.salvarEstado();
        System.out.println("\n");
           
        
        Agencia sistemas = new Agencia ("Agencia Sistemas");  
        
        Agencia.desanexar(galileu);      
        Agencia.desanexar(quatroRodas);       
        Agencia.desanexar(superInteressante);      
        Agencia.desanexar(voceSA);      
        Agencia.desanexar(globoSat);       
        Agencia.desanexar(viva);
        
        sistemas.salvarEstado();
        System.out.println("\n"); 
    }   
}
