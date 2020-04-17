package atividadestrategy;

import java.util.Scanner;

public class AtividadeStrategy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco;
        
        String Vip = "Vip";
        String Credito = "Credito";
        String Publico = "Publico";
        TrocaTipo trocaAlgoritmo;

        System.out.println("\n 1 - Preco Publico\n 2 - Preco Credito\n 3 - Preco Vip \n");
        System.out.print("Escolha a forma de pagamento: ");
        int escolha = sc.nextInt();

        
        switch (escolha) {

            case 1:
                System.out.print("Informe o valor da compra: ");
                preco = sc.nextDouble();
                trocaAlgoritmo = new TrocaTipo(preco, Publico);
                trocaAlgoritmo.escolhaFormaPagamento();
                break;

            case 2:
                System.out.print("Informe o valor da compra: ");
                preco = sc.nextDouble();
                trocaAlgoritmo = new TrocaTipo(preco, Credito);
                trocaAlgoritmo.escolhaFormaPagamento();
                break;

            case 3:
                System.out.print("Informe o valor da compra: ");
                preco = sc.nextDouble();
                trocaAlgoritmo = new TrocaTipo(preco, Vip);
                trocaAlgoritmo.escolhaFormaPagamento();
                break;

            default:
                System.out.println("\nOpção de pagamento invalida!!");
        }
    }
}