package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Cliente cliente = new Cliente();
		Carro carro = new Carro();
		
		
		System.out.print("Entre com o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("Entre com o CPF do cliente: ");
		cliente.setCpf(sc.nextLine());
		
		System.out.print("Entre com o telefone do cliente: ");
		cliente.setTelefone(sc.nextLine());
		
		System.out.print("Entre com o endereço do cliente: ");
		cliente.setNome(sc.nextLine());
		
		System.out.println(carro);
		
		System.out.print("\nEntre com o ano do carro: ");
		carro.setAno(sc.nextInt());
		
		System.out.print("\nEntre com o modelo: ");
		carro.setModelo(sc.nextLine());
		
		System.out.print("\nEntre com acor do carro: ");
		carro.setCor(sc.nextLine());
		
				System.out.print("\nEntre com o tipo de carro: ");
		carro.setTipo(sc.nextLine());
		
		System.out.print("\nEntre com o cambio: ");
		carro.setCambio((char) sc.nextFloat());
		
		System.out.print("\nEntre com o tipo de combustivel: ");
		carro.setCombustivel(sc.nextLine());
		
		System.out.print("\nEntre com o valor do carro: ");
		carro.setValor(sc.nextInt());
		
		System.out.print("\nEntre com o km do carro: ");
		carro.setKm(sc.nextLine());
	
			
		sc.close();

	}

}
