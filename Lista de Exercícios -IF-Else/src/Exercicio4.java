/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio4 {
    
}
import java.util.Scanner;

public class VerificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro N
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificação se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
