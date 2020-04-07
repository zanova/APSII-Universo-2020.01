package application;

import java.util.Scanner;

import strategyImplementation.TrocarPreco;

/**
 *
 * @author Vinícius Trindade
 */
public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        TrocarPreco trocarPreco;
        
        final String clientePublico = "Publico";
        final String clienteVip = "VIP";
        final String clienteCredito = "Credito";
        
        int opc = -1;
        do  {
            System.out.printf("\nCliente sem cadastro [1] - Cliente Credito [2] - Cliente Vip [3] - P'/'Sair [0]");
            System.out.println("\nDigite uma opcao: ");
            opc = sc.nextInt();
            
            if (opc == 1){
                System.out.println("--- Voce escolheu a opacao Cliente sem cadastro ---");
                System.out.println("Informe o valor: ");
                double valor = sc.nextDouble();
                trocarPreco = new TrocarPreco(valor, clientePublico);
                trocarPreco.definePreco();
            }
            
             if (opc == 2){
                System.out.println("--- Voce escolheu a opacao Cliente Credito ---");
                System.out.println("Informe o valor: ");
                double valor = sc.nextDouble();
                trocarPreco = new TrocarPreco(valor, clienteCredito);
                trocarPreco.definePreco();
            }
             
              if (opc == 3){
                System.out.println("--- Voce escolheu a opacao Cliente  Vip ---");
                System.out.println("Informe o valor: ");
                double valor = sc.nextDouble();
                trocarPreco = new TrocarPreco(valor, clienteVip);
                trocarPreco.definePreco();
            }
            
        }while((opc != 0));
        
    }
    
}
