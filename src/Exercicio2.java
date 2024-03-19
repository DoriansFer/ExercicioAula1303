import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //  2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um número:");
        int num = leitura.nextInt(), i = 0;
        System.out.println("A tabuada de " + num + " é:");
        while (i >= 0 && i < 10) {
            i++;
            System.out.println(num * i);
        }
    }
}
