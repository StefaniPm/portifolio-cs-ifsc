import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite o valor do salário mínimo: R$");
            double salarioMinimo = scanner.nextDouble();
            System.out.print("Digite a quantidade de carros vendidos no mês: ");
            int quantidadeCarrosVendidos = scanner.nextInt();
            System.out.print("Digite o valor total das vendas: R$");
            double valorTotalVendas = scanner.nextDouble();
            double salarioFixo = 2 * salarioMinimo;
            double comissaoPorCarro = 150.00;
            double comissaoPorVendas = 0.05 * valorTotalVendas;
            double salarioTotal = salarioFixo + (quantidadeCarrosVendidos * comissaoPorCarro) + comissaoPorVendas;
            System.out.println("O salário do funcionário é: R$" + salarioTotal);
  
        }
    }
}


