package projeto;

import java.util.Scanner;

public class Lista {

    // PASSO1-MENU.PRINCIPAL
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int selecionar = 0;
        int tamanhoLista;

        System.out.println("=====================================");
        System.out.println("Digite o tamanho da lista:");
        System.out.println("=====================================");

        tamanhoLista = teclado.nextInt();

        String[] lista = new String[tamanhoLista];

        // mantem.o.programa.funcionando
        while (selecionar != 5) {

            System.out.println("=====================================");
            System.out.println("-----------LISTA DE TAREFAS----------");
            System.out.println("(1): ADICIONAR TAREFA ");//OK
            System.out.println("(2): REMOVER TAREFA");//OK
            System.out.println("(3): CONCLUIR TAREFA");//OK
            System.out.println("(4): MODIFICAR");//AGORA OK!
            System.out.println("(5): SAIR");//OK
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
                System.out.println("=====================================");
                System.out.println("-----------REMOVER TAREFA------------");
                System.out.println("=====================================");

                System.out.println("Digite a posição da tarefa:");
                int remover = teclado.nextInt();

                if (remover >= 0 && remover < tamanhoLista) {
                    lista[remover] = null;
                    System.out.println("Tarefa removida!");
                } else {
                    System.out.println("Posição inválida!");
                }
            }
            
            // 3.CONCLUIR.TAREFA
            if (selecionar == 3) {
                System.out.println("Qual tarefa você deseja concluir?: ");
                int numero = teclado.nextInt();
                concluir(lista, numero);
            }

            // 4.MODIFICAR (Adicionado corretamente dentro do bloco while do main)
            if (selecionar == 4) {
                modificar(lista, tamanhoLista);
            }

            // 5.ENCERRA.O.PROGRAMA
            if (selecionar == 5) {
                System.out.println("Programa encerrado!");
            }
        }
    }

    // PASSO1-ADICIONAR.TAREFA
    public static void adicionar(String[] lista, int tamanhoLista) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("-----------LISTA DE TAREFAS----------");
        System.out.println("=====================================");

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Digite a sua tarefa:");
            lista[i] = teclado.nextLine();
        }

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println(lista[i]);
        }
    }
    
    // 3. METODO CONCLUIR
    public static void concluir(String[] lista, int numero) {
        int indice = numero - 1; // Ajusta caso o usuário pense em listas começando de 1
        
        if (indice >= 0 && indice < lista.length && lista[indice] != null) {
            lista[indice] = lista[indice] + " [OK]";
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Tarefa não encontrada ou posição vazia!");
        }
    }

    // 4. METODO MODIFICAR (Criado de forma independente e com correção do buffer)
    public static void modificar(String[] lista, int tamanhoLista) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("---------Modificar-------------");
        System.out.println("==============================");
        
        System.out.println("Digite a posição da tarefa ");
        int posicao = teclado.nextInt();

        teclado.nextLine(); 
        
        if (posicao >= 0 && posicao < tamanhoLista) {
            System.out.println("Digite a nova tarefa:");
            lista[posicao] = teclado.nextLine();
            System.out.println("Tarefa modificada com sucesso!");
        } else {
            System.out.println("Posição inválida!");
        }
    }
}