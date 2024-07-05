
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            System.out.println("insira a distancia percorrida em km:");
            double distanciaTotal = scanner.nextDouble();
            
            System.out.println("Insira a quantidade de combustivel consumida em litro");
            double volumeCombustivel = scanner.nextDouble();
            
            double consumoMedio = distanciaTotal / volumeCombustivel;
            
            
            System.out.println("o consumo desse automovel será de: " + consumoMedio + " km/1");
        }
}

 
