/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe dois numeros inteiros: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        while (x != y) {
            System.out.println("informe dois numeros inteiros: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
        }
    }
}
