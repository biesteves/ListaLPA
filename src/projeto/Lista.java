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
        char[] prioridade = new char[tamanhoLista];//chamada.de.vetor.para.PRIORIDADE
        boolean[] concluida = new boolean[tamanhoLista];//chamada.de.vetor.para.CONCLUIDA

        // mantem.o.programa.funcionando
        while (selecionar != 6) {

            System.out.println("=====================================");
            System.out.println("-----------LISTA DE TAREFAS----------");
            System.out.println("=====================================");
            System.out.println("(1): ADICIONAR TAREFA ");
            System.out.println("(2): REMOVER TAREFA");
            System.out.println("(3): CONCLUIR TAREFA");
            System.out.println("(4): MOSTRAR AS TAREFAS");
            System.out.println("(5): MODIFICAR");
            System.out.println("(6): SAIR");
            System.out.println("");//pula.uma.linha
            System.out.println("=====================================");
            System.out.println("Digite um número para selecionar:");
            System.out.println("=====================================");

            selecionar = teclado.nextInt();
            
            // 1.ADICIONAR
            if (selecionar == 1) {
                	adicionar(lista, prioridade,concluida,tamanhoLista);//chamada.de.metodo

            }

            // 2.REMOVER.TAREFA
            if (selecionar == 2) {
            		removerTarefa(lista, tamanhoLista);//chamada.de.metodo

            }
            
            //3.CONCLUIR.TAREFA
            if(selecionar == 3) {
            	concluir(lista, concluida);//chamada.de.metodo
            }
            //4.MOSTRAR.TAREFA
            if(selecionar == 4) {
            	mostrarLista(lista, prioridade, concluida);//chamada.de.metodo

            }
            
            //5.MODIFICAR.TAREFA
            if(selecionar == 5) {
            	modificar(lista, prioridade, concluida, tamanhoLista);//chamada.de.metodo
            	
            }

            // 5.ENCERRA.O.PROGRAMA
            if (selecionar == 6) {

                System.out.println("Programa encerrado!");

            }

        }

        //teclado.close();
    }

    // PASSO1-ADICIONAR.TAREFA
    public static void adicionar(String[] lista, char[] prioridade, boolean[] concluida, int tamanhoLista) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("-------ADICIONAR TAREFA-------");
        System.out.println("==============================");

        teclado.nextLine();

        for (int i = 0; i < tamanhoLista; i++) {

            System.out.println("Digite a sua tarefa " + (i + 1) + ":");
            lista[i] = teclado.nextLine();

            System.out.println("Selecione a prioridade da tarefa:");
            System.out.println("(A) Alta");
            System.out.println("(M) Média");
            System.out.println("(B) Baixa");

            prioridade[i] = Character.toUpperCase/*Deixa.em.caixa.alta*/(teclado.next().charAt(0));
            concluida[i] = false;//marcar.concluido

            teclado.nextLine();
        }
    }
    
    //PASSO2-REMOVER.TAREFA
    public static void removerTarefa(String[] lista, int tamanhoLista) {
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Digite a posição da tarefa:");
        int remover = teclado.nextInt();
        int indice = remover - 1;

        
        
        if (remover >= 0 && remover < tamanhoLista) {

            lista[remover] = null;
            System.out.println("Tarefa removida!");

        } else {

            System.out.println("Posição inválida!");

        }
    }
    
    
    //PASSO3-CONCLUIR.TAREFA
    public static void concluir(String[] lista, boolean[] concluida) {
    	 Scanner teclado = new Scanner(System.in);

    	    System.out.println("==============================");
    	    System.out.println("------CONCLUIR TAREFA---------");
    	    System.out.println("==============================");

    	    System.out.println("Qual tarefa você deseja concluir?");
    	    int numero = teclado.nextInt();

    	    int indice = numero - 1;

    	    if (indice >= 0 && indice < lista.length && lista[indice] != null) {
    	    	concluida[indice] = true;//marca.como.concluido
    	        System.out.println("Tarefa concluída com sucesso!");
    	    } else {
    	        System.out.println("Tarefa não encontrada ou posição vazia!");
    	    }
    }
    //4.MOSTRAR.TAREFA
    public static void mostrarLista(String[] lista, char[] prioridade, boolean[] concluida) {

        System.out.println("===================================");
        System.out.println("---------MOSTRAR TAREFAS-----------");
        System.out.println("===================================");

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] != null) {

                String status;

                if (concluida[i]) {
                    status = "X";
                } else {
                    status = " ";
                }

                System.out.println(
                    (i + 1) + " - [" +
                    status + "] [" +
                    prioridade[i] + "] " +
                    lista[i]
                );
            }
        }
    }
    
    //PASSO5-MODIFICAR.TAREFA
    public static void modificar(String[] lista, char[] prioridade, boolean[] concluida, int tamanhoLista) {
    	   Scanner teclado = new Scanner(System.in);

    	    System.out.println("==============================");
    	    System.out.println("------MODIFICAR TAREFA--------");
    	    System.out.println("==============================");

    	    System.out.println("Digite a posição da tarefa:");
    	    int posicao = teclado.nextInt();

    	    int indice = posicao - 1;

    	    teclado.nextLine();

    	    if (indice >= 0 && indice < tamanhoLista && lista[indice] != null) {

    	        System.out.println("Nova descrição:");
    	        lista[indice] = teclado.nextLine();

    	        System.out.println("Nova prioridade (A/M/B):");
    	        prioridade[indice] =
    	            Character.toUpperCase(teclado.next().charAt(0));

    	        System.out.println("Tarefa concluída? (S/N)");
    	        char resposta =
    	            Character.toUpperCase(teclado.next().charAt(0));

    	        if (resposta == 'S') {
    	            concluida[indice] = true;
    	        } else {
    	            concluida[indice] = false;
    	        }

    	        System.out.println("Tarefa modificada com sucesso!");

    	    } else {

    	        System.out.println("Posição inválida!");

    	    }
    	    
    }
}
    
    	