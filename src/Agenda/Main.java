package Agenda;

import java.io.IOException;
import java.util.Scanner;

public class Main {	

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int opcao;
		
		do {			
			
			Agenda.Imprimir();			

			System.out.printf("\n\nDigite uma opção: ");
			opcao = in.nextInt();

			switch (opcao) {

			case 1:
				CRUD.Adicionar();
				break;
			case 2:
				CRUD.Remover();
				break;
			case 3:
				CRUD.Atualizar();
				break;
			case 4:
				CRUD.GetPessoas();
				break;						
			}			
						
		}while (opcao != 5);	

	}

}
