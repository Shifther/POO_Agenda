package Agenda;

public class Agenda {
	
	public static void Imprimir() {

		System.out.println();
		System.out.printf("%s%s\n","|- - - - - - - - - -" ,"|");
		System.out.printf("%s%12s%8s\n","|","Agenda","|");	
		System.out.printf("%s%s\n","|- - - - - - - - - -" ,"|");		
		System.out.printf("| [1] %s%5s\n"," Adicionar","|");
		System.out.printf("| [2] %s%7s\n"," Remover","|");
		System.out.printf("| [3] %s%8s\n"," Editar","|");
		System.out.printf("| [4] %s%2s\n"," Listar Todos","|");
		System.out.printf("| [5] %s%10s\n"," Sair","|");			
		System.out.printf("%s%s\n","|___________________" ,"|");

	}
}
