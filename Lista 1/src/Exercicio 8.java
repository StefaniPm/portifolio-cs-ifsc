
package exercercicio.pkg13;

import java.util.Scanner;

public class Exercercicio13 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("digite um numero para calcular a raiz quadrada:");
      double numero = scanner.nextDouble();
      
      double raizQuadrada = Math.sqrt(numero);
      
      System.out.println("A raiz quadrada de " + numero + "é:" + raizQuadrada);
      scanner.close();
    }
    
}
