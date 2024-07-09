
package aula08;

import java.util.Scanner;



public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Digite o preço do quilowatt de energia:");
        double precoQuilowatt = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de  Quilowatts consumida:");
        double quilowattsConsumidos = scanner.nextDouble();
        
        double valorSemAtraso = precoQuilowatt * quilowattsConsumidos;
        
        double valorComAtraso = valorSemAtraso * 1.10;


        if (quilowattsConsumidos > 70) {
            System.out.println("Consumo elevado de energia");
        } else {
            System.out.println("Você é um consumidor consciente");
        }

       
        System.out.println("Valor a ser pago (sem atraso): R$" + valorSemAtraso);
        System.out.println("Valor a ser pago (com atraso): R$" + valorComAtraso);

        scanner.close();
    
    }
    
    
}
