package aulas;

import java.util.Locale;
import java.util.Scanner;

public class NomeSenhaUsuario {

	private static int senha;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Entre com nome de usuario: ");
		String usuario = sc.nextLine();

		System.out.print("Entre com a senha: ");
		senha = sc.nextInt();

		if (usuario.equals("carolina") && senha == (123456789)) {
			System.out.printf("Usuário %s logado com sucesso.", usuario);
		} else {
			System.out.printf("Usuário ou senha inválidos!");
		}

		sc.close();

	}
}
