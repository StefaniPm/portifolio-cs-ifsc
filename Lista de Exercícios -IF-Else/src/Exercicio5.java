/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio5 {
    
}
import java.util.Scanner;

public class VerificadorFaixaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro N
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificação da faixa do número e impressão da mensagem correspondente
        if (numero <= 10) {
            System.out.println("F1");
        } else if (numero <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }

        scanner.close();
    }
}
