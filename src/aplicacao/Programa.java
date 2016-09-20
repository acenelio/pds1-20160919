package aplicacao;

import java.math.BigDecimal;
import java.util.Scanner;

import dominio.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o saldo inicial: ");
		BigDecimal inicial = new BigDecimal(sc.nextLine());

		Conta conta = new Conta(inicial);

		System.out.println("Digite um valor a ser debitado da conta: ");
		BigDecimal valor = new BigDecimal(sc.nextLine());

		try {
			conta.debitar(valor);
			System.out.println("Saldo atualizado: " + conta.getSaldo());
		} catch (ServicoException e) {
			System.out.println(e.getMessage());
		} 

		sc.close();
	}

}
