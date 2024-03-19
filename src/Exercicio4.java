import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.
        System.out.println("Digite um número");
        int numb = leitura.nextInt();
        boolean ehPrimo = true;

        if (numb <= 1) {
            ehPrimo = false;
        } else {
            for (int g = 2; g <= Math.sqrt(numb); g++) {
                if (numb % g == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numb + " é um número primo");
        } else {
            System.out.println(numb + " não é um número primo");
        }
    }
}
