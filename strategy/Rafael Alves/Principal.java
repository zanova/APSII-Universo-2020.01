package strategy;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		double valor;
		String cliente;

		System.out.println("Digite [ Publico ] se voce é publico");
		System.out.println("Digite [ Credito ] se voce é Credito");
		System.out.println("Digite [ VIP ] se vove é VIP\n");
	    cliente = sc.nextLine();
	    
	    ControlaValor c1;
		
		if(cliente.equalsIgnoreCase("Publico")){
		
           System.out.println("-----------PUBLICO------------");
		   System.out.println("Digite o valor: ");
		   valor = sc.nextDouble();
		   c1 = new ControlaValor(cliente, valor);
		   c1.mudaPreco();
		   
		}
		if(cliente.equalsIgnoreCase("Credito")){
			
	           System.out.println("-----------CREDITO------------");
			   System.out.println("Digite o valor: ");
			   valor = sc.nextDouble();
			   c1 = new ControlaValor(cliente, valor);
			   c1.mudaPreco();
			}
		if(cliente.equalsIgnoreCase("VIP")){
			
	           System.out.println("-----------VIP------------");
			   System.out.println("Digite o valor: ");
			   valor = sc.nextDouble();
			   c1 = new ControlaValor(cliente, valor);
			   c1.mudaPreco();
			}

		sc.close();

	}

}
