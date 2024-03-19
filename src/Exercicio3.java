import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        //3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.
        int soma = 0, i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 à 100 é igual a: " + soma);
    }
}
