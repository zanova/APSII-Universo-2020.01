
package padraostrategy;

import PricesStrategy.Controlador;
import java.util.Scanner;

public class PadraoStrategy
{

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        
        int opcao;
        double valor;
        String categoria;
        
        do
        {
            System.out.print("\nSelecione a Opcao (1 - Selecionar cliente / 0 - Sair): ");
            
            opcao = ler.nextInt();
            
            if (opcao == 1)
            {
                ler.nextLine();
                System.out.print("\nDigite a categoria: (Publico / VIP / Credito): ");
                
                categoria = ler.nextLine();
                
                if (categoria.equalsIgnoreCase("Publico") || (categoria.equalsIgnoreCase("Vip")) || categoria.equalsIgnoreCase("Credito"))
                {
                    System.out.print("Digite o valor: ");
                
                    valor = ler.nextDouble();
                
                    Controlador control = new Controlador(categoria, valor);
                    
                    System.out.println();
                
                    control.VerificaCategoria();
                }
                
                else System.out.println("Categoria invalida!");
            }
            
            if (opcao != 1) System.out.println("\nOpcao invalida!");
            
        } while (opcao != 0);
        
        System.out.println("\nSaindo...");
        
    }
}
