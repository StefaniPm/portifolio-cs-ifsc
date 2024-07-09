/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio2 {

    public static void main(String[] args) {
        int x, y, soma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe dois numeros inteiros, o segundo numero deve ser maior que o primeiro: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        while (y > x) {
            soma = y + x;
            System.out.println("A soma eh: " + soma);
            System.out.println("informe dois numeros inteiros, o segundo numero deve ser maior que o primeiro: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
    }
}
