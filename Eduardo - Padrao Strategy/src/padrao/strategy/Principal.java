package padrão.strategy;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Principal {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
        
        int opcao = 5;
        double valor;
        String Pub = "Publico";
        String Vip = "VIP";
        String Cred = "Credito";
        
        MudaValor muda;
        
        do  {
            System.out.printf("\nInforme o tipo de cliente para calcular o valor: ");
            System.out.println("\nCliente Público [1] - Cliente a Credito [2] - Cliente Vip [3]");
            System.out.print("\nDigite a opção desejada: ");
            opcao = ler.nextInt();
           
            
            
            
            if (opcao == 1){
                System.out.print("Informe o valor da compra:  ");
                valor = ler.nextDouble();
                muda = new MudaValor(valor, Pub);
                muda.definePreco();
            }
            
             if (opcao == 2){
                System.out.print("Informe o valor da compra: ");
                valor = ler.nextDouble();
                muda = new MudaValor(valor, Cred);
                muda.definePreco();
            }
             
              if (opcao == 3){
                System.out.print("Informe o valor da compra: ");
                valor = ler.nextDouble();
                muda = new MudaValor(valor, Vip);
                muda.definePreco();
            }
            
        }while((opcao != 0));
        
    }
}
  
