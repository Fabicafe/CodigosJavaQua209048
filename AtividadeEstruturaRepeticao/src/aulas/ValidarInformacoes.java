package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ValidarInformacoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);



	       int nome = 0;
	       int idade = 0;
	       float salario = 0;
	       char sexo = 0; 
		   char estadoCivil = 0;

	       

	         while(true){

	           System.out.print("Informe seu nome: ");

	           nome = sc.nextInt();

	           if (nome = sc.nextInt() > 3){

	               break;

	           }else{

	               System.out.println("O nome precisa ser maior de 3 caracteres!");

	           }

	       }

	       

	          while(true){

	           System.out.print("Informe sua idade: ");

	           idade = sc.nextInt();

	           if (idade > 0 && idade <= 150){

	               break;

	           }else{

	               System.out.println("A idade precisa estar entre 0 e 150 anos!");

	           }

	       }

	           while(true){

	           System.out.print("Informe seu salário: ");

	           salario = sc.nextFloat();

	           if (salario > 0){

	               break;

	           }else{

	               System.out.println("O salário precisa ser maior que 0!");

	           }

	       }

	      
	    
	       while(true){

	           System.out.print("Informe seu sexo[M/F]: ");

	           sexo = sc.next().charAt(0);

	           sexo = (Character.toString(sexo).toUpperCase()).charAt(0);

	           if (sexo == 'M' || sexo == 'F'){

	               break;

	           }else{

	               System.out.println("O nome precisa ser 'M' ou 'F'!");

	           }

	       }

	       

	         while(true){

	           System.out.print("Informe seu estado civil[c/s/v/d]: ");

	           estadoCivil = sc.next().charAt(0);

	           estadoCivil = (Character.toString(estadoCivil).toLowerCase()).charAt(0);

	           if (estadoCivil == 'c' || estadoCivil == 's' || estadoCivil == 'v' || estadoCivil == 'd'){

	               break;

	           }else{

	               System.out.println("O estado civil inválido!");
		
		
			
	           }
	           
	         }
		

	       		sc.close();

	       		
	       		
	       		
	       		
	       		
	       	}

	       }