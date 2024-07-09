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
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorA, valorB;
        
        System.out.print("Informe o valor de A: ");
        valorA = scanner.nextDouble();
        
        System.out.print("Informe o valor de B: ");
        valorB = scanner.nextDouble();
       
        if(valorA == valorB){
            System.out.println("Os valores sao iguais");
        } else {
            System.out.println("Os valores nao sao iguais");
        }
    }
}
