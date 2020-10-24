package Agenda;

import java.util.Scanner;

public class CRUD {
		
	static Scanner in = new Scanner(System.in);	
	
	static String Nome;
	static String Sobrenome;
	static String Telefone;
	static String[][] Pessoa = new String[100][3];
	static int CountId = 0;
	
		
	public static void Adicionar() {
							
		System.out.printf("\n\nNome: ");
		Nome = in.next();

		System.out.printf("Sobrenome: ");
		Sobrenome = in.next();

		System.out.printf("Telefone: ");
		Telefone = in.next();
		
		Pessoa[CountId][0] = Nome;
		Pessoa[CountId][1] = Sobrenome;
		Pessoa[CountId][2] = Telefone;
		
		CountId++;
				
	}
	
	public static void Atualizar() {
		System.out.printf("Digite o Id da Pessao a ser Editado: ");
		int Id = in.nextInt();
		
		System.out.printf("\n\nNome: ");
		Nome = in.next();

		System.out.printf("Sobrenome: ");
		Sobrenome = in.next();

		System.out.printf("Telefone: ");
		Telefone = in.next();
		
		Pessoa[Id][0] = Nome;
		Pessoa[Id][1] = Sobrenome;
		Pessoa[Id][2] = Telefone;
	}
		
	public static void Remover() {		

		
		System.out.println("Digite o Id da Pessao a ser Removido: ");
		int Id = in.nextInt();
		
		if (Id <= CountId) {

		for(int i=0; i<3; i++) {
			Pessoa[Id][i] = null;
		}
		
		for (int i=Id; i<=CountId; i++) {
			for(int j=0; j<3; j++) {
				Pessoa[i][j] = Pessoa[i+1][j] ;
			}
		}
		
		CountId--;
		}
		else {
			System.out.println("Este ID não está cadastrado!");
		}

	}
	
	public static void GetPessoas() {
		System.out.println("\n\nLista Agenda");
		for (int i=0; i<CountId; i++) {
			System.out.print(" Id: " + i);
			System.out.print(" Nome: " + Pessoa[i][0]);	
			System.out.print(" Sobrenome: " + Pessoa[i][1]);	
			System.out.print(" Telefone: " + Pessoa[i][2]);	
			System.out.println();
		}
			
	}
}
