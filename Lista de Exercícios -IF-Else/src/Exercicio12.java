/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio12 {
    import java.util.Scanner;

public class TipoAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor do ângulo
        System.out.print("Digite o valor do ângulo (em graus): ");
        int angulo = scanner.nextInt();

        // Verificação do tipo de ângulo
        if (angulo < 90) {
            System.out.println("O ângulo é agudo.");
        } else if (angulo == 90) {
            System.out.println("O ângulo é reto.");
        } else {
            System.out.println("O ângulo é obtuso.");
        }

        scanner.close();
    }
}

}
