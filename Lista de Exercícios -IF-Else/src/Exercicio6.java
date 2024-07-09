/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio6 {
    import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três números inteiros distintos
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        // Verificação do menor número
        int menor = numero1; // Suponha que o primeiro número seja o menor inicialmente

        if (numero2 < menor) {
            menor = numero2; // Se o segundo número for menor, atualize o menor
        }

        if (numero3 < menor) {
            menor = numero3; // Se o terceiro número for menor, atualize o menor
        }

        // Impressão do menor número
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}

}
