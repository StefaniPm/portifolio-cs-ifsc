

package exercicio12;

import java.util.Scanner;


public class Exercicio12{

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
            double somaQuadrados = 0;
            
            for (int i = 1; 1<= 4; i++) {
                
                System.out.println("Digite o " + i + "º numero:");
                
                double numero = scanner.nextDouble();
                
                double quadrado = numero * numero;
                somaQuadrados += quadrado;
            }
    System.out.println("a soma dos quatro numeros é:" + somaQuadrados);
    scanner.close();
    
    }}
