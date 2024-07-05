/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaaula05;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorA, valorB, valorC, soma;
        
        System.out.print("Informe o valor de A: ");
        valorA = scanner.nextDouble();
        
        System.out.print("Informe o valor de B: ");
        valorB = scanner.nextDouble();
        
        System.out.print("Informe o valor de C: ");
        valorC = scanner.nextDouble();
        
        soma = valorA + valorB;
        
        System.out.println("A soma dos valores A e B e: " + soma);
        
        if(soma <= valorC){
            System.out.println("A soma de A com B e menor ou igual ao valor C");
        } else {
            System.out.println("A soma de A com B e maior ou igual ao valor de C");
    }
    }
}
