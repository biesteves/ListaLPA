package projeto;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int selecionar, tamanhoLista;
		
		System.out.println("=====================================");
		System.out.println("-----------LISTA DE TAREFAS----------");
		System.out.println("(1): ADIONAR TAREFA ");
		System.out.println("(2): REMOVER TAREFA");
		System.out.println("(3): MODIFICAR");
		System.out.println("(4): SAIR");
		System.out.println("=====================================");
		System.out.println("Digite um núemro para selecionar: ");
		System.out.println("=====================================");
		selecionar = teclado.nextInt();
	
	System.out.println("=====================================");
	System.out.println("Digite o tamanho a lista a ser criada: ");
	System.out.println("=====================================");
	tamanhoLista = teclado.nextInt();
	adicionar(selecionar, tamanhoLista);
	
	}

	public static void adicionar(int selecionar, int tamanhoLista) { //Passo2
		Scanner teclado = new Scanner(System.in);
		   System.out.println("=====================================");
		   System.out.println("-----------LISTA DE TAREFAS----------");
		   System.out.println("=====================================");

		   String[] lista = new String[tamanhoLista];
		   
		   System.out.println("Digite a sua tarefa: ");
		
		for(int i=0; i<tamanhoLista; i++) {
			
			lista[i] = teclado.nextLine();
			
			}
		
	        for(int i=0; i<tamanhoLista; i++) {
				
	        	System.out.println(lista[i]);
		
	}
	        
	}
}

