package info;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		String name;
		int deposito, tranferencia;
		
		
		System.out.println("Escreva seu nome: ");
		name = scan.next();
		
		cliente.setNome(name);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		System.out.println("Digite o valor do deposito: ");
		deposito = scan.nextInt();
		
		System.out.println("Digite o valor da transferencia: ");
		tranferencia = scan.nextInt();
		
		poupanca.depositar(deposito);
		poupanca.transferir(tranferencia, cc);
		
		poupanca.imprimirExtrato();
		cc.imprimirExtrato();
		
	}

}
