package projeto;

import java.util.Scanner;

public class Lista {

    //PASSO1-MENU.PRINCIPAL
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int selecionar = 0;
        int tamanhoLista;

        System.out.println("=====================================");
        System.out.println("Digite o tamanho da lista:");
        System.out.println("=====================================");

        tamanhoLista = teclado.nextInt();

        //mantem.o.programa.funcionando
        while (selecionar != 4) {

            System.out.println("=====================================");
            System.out.println("-----------LISTA DE TAREFAS----------");
            System.out.println("(1): ADICIONAR TAREFA ");
            System.out.println("(2): REMOVER TAREFA");
            System.out.println("(3): MODIFICAR");
            System.out.println("(4): SAIR");
            System.out.println("=====================================");
            System.out.println("Digite um número para selecionar:");
            System.out.println("=====================================");

            selecionar = teclado.nextInt();

            if (selecionar == 1) {

                adicionar(selecionar, tamanhoLista);

            }

            //Enecerra.o.programa
            if (selecionar == 4) {

                System.out.println("Programa encerrado!");

            }

        }

    }

    //PASSO1-ADICIONAR.TAREFA
	public static void adicionar(int selecionar, int tamanhoLista) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("-----------LISTA DE TAREFAS----------");
        System.out.println("=====================================");

        String[] lista = new String[tamanhoLista];

        teclado.nextLine();

        System.out.println("Digite a sua tarefa:");

        //Adicionar.as.tarefas
        for (int i = 0; i < tamanhoLista; i++) {

            lista[i] = teclado.nextLine();

        }

        //Mostrar.as.tarefas
        for (int i = 0; i < tamanhoLista; i++) {

            System.out.println(lista[i]);

        }

    }

}