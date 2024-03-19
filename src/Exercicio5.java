import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //  5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.
        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);

        for (int i = 1; i <= 20; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
