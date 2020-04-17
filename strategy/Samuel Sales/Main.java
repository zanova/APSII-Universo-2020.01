package strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Pub = "Publico";
        String Vip = "VIP";
        String Cred = "Credito";
        AlteraValor alteracao;
        double valor;
        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.println("Digite o Tipo do Ingresso");
        System.out.println("1 - Para Preço Publico");
        System.out.println("2 - Para Preço Credito");
        System.out.println("3 - Para Preço Vip");
        System.out.print("Opc: ");
        opc = sc.nextInt();

        switch (opc) {

            case 1: {
                System.out.println("Preço Publico Escolhido");
                valor = 11.50;
                alteracao = new AlteraValor(valor, Pub);
                alteracao.definePreco();
                break;
            }
            case 2: {
                System.out.println("Preço Credito Escolhido");
                valor = 10.50;
                alteracao = new AlteraValor(valor, Cred);
                alteracao.definePreco();

                break;
            }
            case 3: {
                System.out.println("Preço Vip Escolhido");
                valor = 9.50;
                alteracao = new AlteraValor(valor, Vip);
                alteracao.definePreco();
                break;
            }
            default: {
                System.out.println("Opc invalida");
            }
        }
    }
}
