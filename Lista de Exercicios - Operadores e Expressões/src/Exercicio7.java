import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
       
        double precoTipo1 = 1.50;
        double precoTipo2 = 2.00;
        double precoTipo3 = 0.75;

      
        try ( 
                Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Digite a quantidade vendida do picolé tipo 1: ");
            int quantidadeTipo1 = scanner.nextInt();
            
            System.out.print("Digite a quantidade vendida do picolé tipo 2: ");
            int quantidadeTipo2 = scanner.nextInt();
            
            System.out.print("Digite a quantidade vendida do picolé tipo 3: ");
            int quantidadeTipo3 = scanner.nextInt();
            
            
            double valorTipo1 = quantidadeTipo1 * precoTipo1;
            double valorTipo2 = quantidadeTipo2 * precoTipo2;
            double valorTipo3 = quantidadeTipo3 * precoTipo3;
            
            
            double valorTotalVendas = valorTipo1 + valorTipo2 + valorTipo3;
            
            
            System.out.println("Valor arrecadado com as vendas do picolé tipo 1: R$" + valorTipo1);
            System.out.println("Valor arrecadado com as vendas do picolé tipo 2: R$" + valorTipo2);
            System.out.println("Valor arrecadado com as vendas do picolé tipo 3: R$" + valorTipo3);
            System.out.println("Valor total das vendas: R$" + valorTotalVendas);
        }}}
