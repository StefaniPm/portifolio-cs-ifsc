/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio8 {
    import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome, categoria e salário do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a categoria do funcionário (A, B, C, D, E, F, G ou H): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Cálculo do aumento de acordo com a categoria
        double aumento;
        switch (categoria) {
            case 'A':
            case 'H':
                aumento = salarioAtual * 0.10;
                break;
            case 'B':
            case 'D':
            case 'E':
                aumento = salarioAtual * 0.15;
                break;
            case 'C':
            case 'F':
                aumento = salarioAtual * 0.25;
                break;
            default:
                aumento = salarioAtual * 0.30;
        }

        // Salário reajustado
        double salarioReajustado = salarioAtual + aumento;

        // Impressão dos dados do funcionário e do salário reajustado
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Categoria do funcionário: " + categoria);
        System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);

        scanner.close();
    }
}

}
