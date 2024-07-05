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
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        System.out.print("Informe o primeiro numero: ");
        numero1 = scanner.nextInt();
        
        System.out.print("Informe o primeiro numero: ");
        numero2 = scanner.nextInt();
        
        System.out.print("Informe o primeiro numero: ");
        numero3 = scanner.nextInt();
        
        if(numero1 <= numero2 && numero1 <= numero3){
            System.out.println(numero1 + " ");
        } if(numero2 <= numero3){
            System.out.println(numero2 + " ");
            System.out.println(numero3);
        } else {
            System.out.println(numero3 + " ");
            System.out.println(numero2);
        }
    }
    
}
