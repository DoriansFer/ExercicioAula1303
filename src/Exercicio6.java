import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // 6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar um número
        // negativo, o programa deve exibir a média dos números inseridos até aquele momento.
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros positivos, ou digite um número negativo para sair:");

        int numero = leitura.nextInt();
        while (numero >= 0) {
            soma += numero;
            contador++;
            System.out.println("Digite outro número, ou digite um número negativo para sair:");
            numero = leitura.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }

    }
}
