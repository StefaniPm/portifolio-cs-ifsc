
package listaaula05;

import java.util.Scanner;

public class Exercicio02 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o preço do quilowatts de energia:");
        double precoQuilowatts = scanner.nextDouble();
        
        System.out.println("Informe a quantidade de quilowatts consumido na casa:");
        double quantidadedeQuilowatts = scanner.nextDouble();
        
        double valorConta = precoQuilowatts * quantidadedeQuilowatts;
        double valorContaAtraso = valorConta * 1.1;
        
        System.out.println("Valor a ser pago pela residência (pago em dia): R$" + valorConta);
        System.out.println("Valor a ser pafo pela residência (pago com atraso): R$" + valorContaAtraso);
        
    } 
    
}
