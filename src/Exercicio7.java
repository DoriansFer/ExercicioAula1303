import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // 7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, multiplicação e divisão
        // entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.

        System.out.println("-----Calculadora-----" +
                "\n Digite um número");
        double numb1 = leitura.nextDouble();
        System.out.println("Digite outro número");
        double numb2 = leitura.nextDouble();
        while (true) {
            System.out.println("Digite o número correspondente a operação que deseja realizar:" +
                    "\n1- Somar" +
                    "\n2- Subtrair número 1 pelo número 2" +
                    "\n3- Subtrair número 2 pelo número 1" +
                    "\n4- Multiplicar" +
                    "\n5- Dividir número 1 por número 2" +
                    "\n6- Dividir número 2 por número 1" +
                    "\n7- Sair"
            );
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("A soma resulta em: " + (numb1 + numb2));
                    break;
                case 2:
                    System.out.println("A subtração do número 1 pelo número 2: " + (numb1 - numb2));
                    break;
                case 3:
                    System.out.println("A subtração do número 2 pelo número 1: " + (numb2 - numb1));
                    break;
                case 4:
                    System.out.println("A multiplicação resulta em: " + (numb1 * numb2));
                    break;
                case 5:
                    System.out.println("A divisão do número 1 pelo número 2: " + (numb1 / numb2));
                    break;
                case 6:
                    System.out.println("A divisão do número 2 pelo número 1: " + (numb2 / numb1));
                    break;
                case 7:
                    System.out.println("Encerrando a calculadora...");
                    System.exit(0); // Sai do programa
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }

    }

}
