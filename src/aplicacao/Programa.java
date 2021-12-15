package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import exceptions.BusinessException;

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
		
		
		
		try {
		acc.saque(quantia);
		System.out.printf("Novo Saldo: %.2f%n", acc.getSaldo());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	

	}

}
