package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Veiculo veiculo = new Veiculo();
		new Moto();
		new Carro();

		System.out.println("*****Cadastre o veiculo*****");

		System.out.print("Entre com o tipo de veiculo: ");
		Veiculo.getTipoVeiculo(sc.nextLine());

		System.out.print("Entre com a marca do veiculo: ");
		Veiculo.setMarca(sc.nextLine());

		System.out.print("Entre com o ano do veiculo: ");
		Veiculo.setAno(sc.nextInt());

		System.out.print("Entre com o modelo: ");
		Veiculo.setModelo(sc.nextLine());

		System.out.print("Entre com a quantidade de pneus: ");
		Veiculo.setQuantidadePneus(sc.nextLine());

		System.out.print("Entre com a potencia: ");
		Veiculo.setPotencia(sc.nextLine());

		System.out.print("Entre com tipo de combustivel: ");
		Veiculo.setTipoCombustivel(sc.nextLine());

		System.out.print("Entre com a capacidade de passageiros: ");
		Veiculo.setQuantosPassageiros(sc.nextLine());

		System.out.print("Entre com o valor: ");
		Veiculo.setValor(sc.nextLine());

		sc.close();
	}
}
