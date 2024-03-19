
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // 9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao
        // usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.

        System.out.println("Digite a temperatura:");
        double temperatura = leitura.nextDouble();

        while (true) {
            System.out.println("Selecione o número correspodente ao item desejado:" +
                    "\n1- Converter de Celsius para Fahrenheit" +
                    "\n2- Converter de Fahrenheit para Celsius" +
                    "\n3- Calcular novamente" +
                    "\n4- Sair");

          int opcao= leitura.nextInt();
          switch (opcao){
              case 1:
                  System.out.println("Em Fahrenheit é igual à: "+((temperatura*1.8)+32));
                  break;
              case 2:
                  System.out.println("Em Celsius é igual à: "+((temperatura-32)/1.8));
                  break;
              case 3:
                  System.out.println("Digite uma nova temperatura");
                  temperatura= leitura.nextDouble();
                  break;
              case 4:
                  System.out.println("Encerrando a conversão...");
                  System.exit(0); // Sai do programa
                  break;
              default:
                  System.out.println("Opção inválida.");
          }

        }
    }
}
