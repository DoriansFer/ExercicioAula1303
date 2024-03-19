import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();



        //8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar
        // adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.



        int palpite = 0, numerodasorte = random.nextInt(100) + 1, tentativasMax = 5;

        System.out.println("Vamos iniciar o jogo \nVocê deve acertar o número que o robô escolheu");
        while (tentativasMax > 0 && palpite != numerodasorte) {
            System.out.println("Digite um número entre 1 à 100, vamos ver se você acerta");
            palpite = leitura.nextInt();
            tentativasMax--;
            if (tentativasMax > 0) {
                if (palpite == numerodasorte) {
                    System.out.println("Parabéns!!!!! Você acertou");
                    tentativasMax = 0;
                } else {
                    if (numerodasorte < palpite) {
                        System.out.println("Tente novamente, você tem " + tentativasMax + " restantes. Talvez seja um número menor...");
                    } else {
                        System.out.println("Tente novamente, você tem " + tentativasMax + " restantes. Talvez seja um número maior...");
                    }

                }
            } else {
                System.out.println("Poxa, acabou seu número de tentativas... GAME OVER!! \n O número era: "+ numerodasorte);
            }
        }
    }
}
