package projeto;

import java.util.Scanner;

public class Lista {

    // PASSO1-MENU.PRINCIPAL
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);

        //Usuaruio.selecionar.o.tamanho.da.lista
    	int selecionar = 0;
        int tamanhoLista;

        System.out.println("=====================================");
        System.out.println("Digite o tamanho da lista:");
        System.out.println("=====================================");

        tamanhoLista = teclado.nextInt();

        String[] lista = new String[tamanhoLista];

        // mantem.o.programa.funcionando
        while (selecionar != 6) {

            System.out.println("=====================================");
            System.out.println("-----------LISTA DE TAREFAS----------");
            System.out.println("=====================================");
            System.out.println("(1): ADICIONAR TAREFA ");//OK
            System.out.println("(2): REMOVER TAREFA");//OK
            System.out.println("(3): CONCLUIR TAREFA");//OK
            System.out.println("(4): MOSTRAR AS TAREFAS");
            System.out.println("(5): MODIFICAR");//OK
            System.out.println("(6): SAIR");//OK
            System.out.println("");//pula.uma.linha
            System.out.println("=====================================");
            System.out.println("Digite um número para selecionar:");
            System.out.println("=====================================");

            selecionar = teclado.nextInt();

            // 1.ADICIONAR
            if (selecionar == 1) {
                	adicionar(lista, tamanhoLista);

            }

            // 2.REMOVER.TAREFA
            if (selecionar == 2) {
            		removerTarefa(lista, tamanhoLista);

            }
            
            //3.CONCLUIR.TAREFA
            if(selecionar == 3) {
            	System.out.println("Qual tafefa você deseja concluir?: ");
            	int numero = teclado.nextInt();
            	concluir(lista, numero);//chamada.de.metodo
            }
            //4.MOSTRAR.TAREFA
            if(selecionar == 4) {
            	System.out.println("===================================");
	            System.out.println("-----------MOSTRAR TAREFAS----------");
	            System.out.println("===================================");
            	mostrarLista(lista);//chamada.de.metodo

            }
            
            //5.MODIFICAR.TAREFA
            if(selecionar == 5) {
            	System.out.println("Qual tarefa você deseja modificar?: ");
            	int numero = teclado.nextInt();
            	modificar(lista, tamanhoLista);
            }

            // 5.ENCERRA.O.PROGRAMA
            if (selecionar == 6) {

                System.out.println("Programa encerrado!");

            }

        }

    }

    // PASSO1-ADICIONAR.TAREFA
    public static void adicionar(String[] lista, int tamanhoLista) {
    	Scanner teclado = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("-------ADICIONAR TAREFA-------");
        System.out.println("==============================");

        // Adicionar.as.tarefas
        for (int i = 0; i < tamanhoLista; i++) {

            System.out.println("Digite a sua tarefa" +  (i)+ ":");//mostar.o.numero.na.tabela

            lista[i] = teclado.nextLine();

        }


    }
    
    //PASSO2-REMOVER.TAREFA
    public static void removerTarefa(String[] lista, int tamanhoLista) {
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Digite a posição da tarefa:");
        int remover = teclado.nextInt();

        if (remover >= 0 && remover < tamanhoLista) {

            lista[remover] = null;
            System.out.println("Tarefa removida!");

        } else {

            System.out.println("Posição inválida!");

        }
    }
    
    
    //PASSO3-CONCLUIR.TAREFA
    public static void concluir(String[] lista, int numero) {
    	int indice = numero - 1;
    	
    	if (indice >= 0 && indice < lista.length && lista[indice] != null) {
    		lista[indice] = lista[indice] + " [X]";
    	
    	}else{
    		System.out.println("Tarefa não encontrada ou posição vazia!");
	 
 }

}
    //4.MOSTRAR.TAREFA
    public static void mostrarLista(String[] lista) {
    	for (int i = 0; i < lista.length; i++) {
    		System.out.println( i + "- " + lista[i]);
    	}
    	
    }
    
    //PASSO5-MODIFICAR.TAREFA
    public static void modificar(String[] lista, int tamanhoLista) {
    	Scanner teclado = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("------MODIFICAR TAREFAS-----");
        System.out.println("==============================");
        
        System.out.println("Digite a posição da tarefa ");
        int posicao = teclado.nextInt();
        
        teclado.nextLine();//
        
        if (posicao >= 0 && posicao < tamanhoLista) {
        	System.out.println("Digite a nova tarefa:");
        	lista[posicao] = teclado.nextLine();
        	System.out.println("Tarefa modificada com sucesso!");
        }else {
        	 System.out.println("Posição inválida! Tente Novamente.");
        }
    }
    	
}