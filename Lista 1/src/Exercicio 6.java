
package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero:");
            double numero = scanner.nextDouble();
            
            double quadrado = numero * numero;
            
            System.out.println(" o quadrado de " + numero + " é:" + quadrado);
        }
    }
    
