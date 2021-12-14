package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta acc = new Conta(numero, titular, saldo, limiteSaque);
		System.out.println();
		System.out.print("Informe o valor do saque");
		double quantia = sc.nextDouble();
		
		if(quantia > acc.getLimiteSaque()) {
			System.out.println("Erro: A quantia excede o limite de saque");
		}
		else if(quantia > acc.getSaldo()) {
			System.out.println("Saldo insuficiente");
		}
		else {
		acc.saque(quantia);
		System.out.printf("Novo Saldo: %.2f%n", acc.getSaldo());
		}
		sc.close();
		

	}

}
