package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EscolhaDeMenuQuantidade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Exercício Switch/Case{
		 * 
		 * Faça um programa que peça ao usuário para escolher o item de um menu e a
		 * quantidade: (apenas 1 item) 1 - sanduiche natureba 2 - Sanduba Bomba 3 -
		 * Coxinha de Jaca 4 - Feijoada vegetariana
		 */

		int selecionado = 0;
		int quantidade = 0;
		
		
		System.out.println("Escolha um item do cardapio:");
		System.out.print("1 - sanduiche natureba");
		System.out.print("2 - Sanduba bomba");
		System.out.print("3 - coxinha de jaca");
		System.out.print("4 - Feijoada vegetariana \n");
		
		System.out.print("Entre com o numero da opção: ");
		selecionado = sc.nextInt();
		
		System.out.print("Entre com a quantidade: ");
		quantidade = sc.nextInt();
		
		switch (selecionado) {
		case 1:
			System.out.println("Opção escolhida: sanduiche natureba");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 2:
			System.out.println("Opção escolhida: sanduba Bomba");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 3:
			System.out.println("Opção escolhida: coxinha de jaca");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 4:
			System.out.println("Opção escolhida: Feijoada Vegetariana");
			System.out.println("Quantidade: " + quantidade);
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		
		}
		
		
		
		sc.close();

	}

}