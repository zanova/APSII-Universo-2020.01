import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.print("Informe o tipo do ciente: ");
        String tipoDoCliente = sc.nextLine();
        System.out.print("Informe o valor da compra: ");
        float precoDaCompra = sc.nextFloat();
        System.out.println("=====================================");

        Pedido pedido = new Pedido(tipoDoCliente, precoDaCompra);
        ProcessamentoDoPedido processamentoDoPedido = new ProcessamentoDoPedido(pedido);
        processamentoDoPedido.calculaPreco();
    }
}
