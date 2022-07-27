package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String usuario;
		String senha;
		
		System.out.print("Entrre com o nome do usuario: ");
		usuario = sc.nextLine();
		
		System.out.print("Entrre com a senha: ");
		senha = sc.nextLine();
		
		while(usuario.equals(senha)) {
			System.out.println("Usuario invalido! ");
			
			System.out.print("Entrre com o nome do usuario: ");
			usuario = sc.nextLine();
			
			System.out.print("Entre com a senha: ");
			senha = sc.nextLine();
					
		}
		
		System.out.println("Cadastro realizado com sucesso");
			
	
	sc.close();

}
}
