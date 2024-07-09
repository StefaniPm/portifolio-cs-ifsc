
package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
            System.out.println("Digite a temperatura em Celsius");
            double temperaturaCelsius = scanner.nextDouble();
            
            double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32.0;
            
            System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        }
    
    
}
