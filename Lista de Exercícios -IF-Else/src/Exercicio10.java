/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio10 {
    import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores dos lados do triângulo
        System.out.print("Digite o valor do lado X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor do lado Y: ");
        double y = scanner.nextDouble();

        System.out.print("Digite o valor do lado Z: ");
        double z = scanner.nextDouble();

        // Verificação se os lados formam um triângulo
        if (x < y + z && y < x + z && z < x + y) {
            // Verificação do tipo de triângulo
            if (x == y && y == z) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Os lados formam um triângulo isóscele.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        scanner.close();
    }
}

}
