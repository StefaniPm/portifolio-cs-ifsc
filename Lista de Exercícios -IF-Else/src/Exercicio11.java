/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio11 {
    import java.util.Scanner;

public class IncrementoSegundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do horário
        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        System.out.print("Digite o minuto (0 a 59): ");
        int minuto = scanner.nextInt();

        System.out.print("Digite o segundo (0 a 59): ");
        int segundo = scanner.nextInt();

        // Incremento do segundo
        segundo++;

        // Verificação e ajuste do segundo, minuto e hora
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        // Impressão do horário acrescido de 1 segundo
        System.out.printf("Horário acrescido de 1 segundo: %02d:%02d:%02d\n", hora, minuto, segundo);

        scanner.close();
    }
}

}
