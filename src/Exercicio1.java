import java.util.Scanner;

public class Exercicio1{
public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    // 1 -Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.
    for (int i = 10; i > 0; i--) {
        System.out.println("A bomba vai explodir em " + i + " segundos...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
}
