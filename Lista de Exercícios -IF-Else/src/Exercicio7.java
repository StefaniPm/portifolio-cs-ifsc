/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio7 {
    import java.util.Scanner;

public class OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = scanner.nextInt();

        // Ordenação dos valores
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        if (valor2 > valor3) {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;

            if (valor1 > valor2) {
                int temp2 = valor1;
                valor1 = valor2;
                valor2 = temp2;
            }
        }

        // Impressão dos valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2 + ", " + valor3);

        scanner.close();
    }
}

}
