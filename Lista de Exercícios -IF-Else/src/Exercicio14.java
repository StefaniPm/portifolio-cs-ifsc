/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio14 {
    import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da altura e do gênero da pessoa
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o gênero (M para masculino, F para feminino): ");
        char genero = scanner.next().charAt(0);

        // Cálculo do peso ideal
        double pesoIdeal;
        if (genero == 'M') {
            pesoIdeal = 72.7 * altura - 58;
        } else if (genero == 'F') {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Gênero inválido. Por favor, digite M para masculino ou F para feminino.");
            return; // Encerra o programa
        }

        // Impressão do peso ideal
        System.out.println("O peso ideal para uma pessoa com altura de " + altura + " metros e gênero " + genero + " é: " + pesoIdeal + " kg");

        scanner.close();
    }
}

}
