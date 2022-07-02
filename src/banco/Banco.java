package banco;

import java.util.Locale;
import java.util.Scanner;

import cliente.Cliente;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		System.out.print("Número da conta: ");
		int numeroCC = sc.nextInt();
		System.out.print("Nome do Usúario: ");
		sc.nextLine();
		String nomeUsuario = sc.nextLine();
		System.out.print("Deseja realizar um deposito Inicial(S/N): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print ("Quanto quer depositar: ");
			double depositoInicial = sc.nextDouble();
			cliente = new Cliente(numeroCC, nomeUsuario, depositoInicial);
		}else {
			cliente = new Cliente(numeroCC, nomeUsuario);
		}
		
		
		System.out.println("Informações " + cliente);
		System.out.println();
		
		System.out.print("Entre com valor de Deposito: ");
		double valor = sc.nextDouble();
		cliente.deposito(valor);
		System.out.println("Deposito realizado: " + cliente);
		System.out.println();
		
		System.out.print("Quanto você quer sacar: ");
		valor = sc.nextDouble();
		cliente.saque(valor);
		System.out.println("Saque realizado: " + cliente);
		sc.close();
	}

}
