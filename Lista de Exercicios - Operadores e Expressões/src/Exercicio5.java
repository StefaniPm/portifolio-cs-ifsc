
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

     
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);{
            
            System.out.print("Digite a medida da base do retângulo: ");
            double base = scanner.nextDouble();
            
            
            System.out.print("Digite a medida da altura do retângulo: ");
            double altura = scanner.nextDouble();
            
            
            double area = base * altura;
            
            
            double perimetro = 2 * (base + altura);
            
            
            System.out.println("A área do retângulo é: " + area);
            System.out.println("O perímetro do retângulo é: " + perimetro);
        }
        }}
    

