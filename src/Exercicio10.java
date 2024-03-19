import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve exibir
        // a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens. O programa deve continuar executando até que o usuário decida sair.

        ArrayList<String> novalista = new ArrayList<>();

        while (true) {
            System.out.println("------Lista de Tarefas------" +
                    "\n O que você deseja fazer? Selecione a opção correspondente:" +
                    "\n1- Criar uma lista" +
                    "\n2- Adicionar um item há uma lista pré-existente" +
                    "\n3- Excluir item da lista" +
                    "\n4- Ver lista" +
                    "\n5- Sair");

            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Lista criada com sucesso!!!");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Digite um item, ou digite 'sair' para finalizar e voltar ao menu");
                    while (true) {
                        System.out.println("Digite o nome");
                        String item = scanner.nextLine();
                        if (item.equalsIgnoreCase("sair")) {
                            break;
                        } else {
                            novalista.add(item);
                            System.out.println(novalista);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual item você deseja excluir?");
                    for (int i = 0; i < novalista.size(); i++) {
                        System.out.println((i + 1) + " - " + novalista.get(i));
                    }
                    System.out.println("Digite o número relacionado a tarefa.");
                    int excluir = scanner.nextInt();
                    novalista.remove(excluir - 1);
                    System.out.println("Tarefa excluída com sucesso");
                    break;
                case 4:
                    System.out.println("------Lista------ \n" + novalista);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    System.exit(0); // Sai do programa
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}
