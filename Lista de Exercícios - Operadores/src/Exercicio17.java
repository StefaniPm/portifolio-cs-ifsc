package listaaula05;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalParcelas, parcelasPagas;
        double valorCadaParcela, valorTotal, aindaDevendo;
        
        System.out.print("Informe a quantidade de parcelas: ");
        totalParcelas = scanner.nextInt();
        
        System.out.print("Informe o valor de cada parcela: ");
        valorCadaParcela = scanner.nextDouble();
        
        System.out.print("Informe quantas parcelas ja foram paga: ");
        parcelasPagas = scanner.nextInt();
        
        valorTotal = parcelasPagas * valorCadaParcela;
        
        aindaDevendo = (totalParcelas - parcelasPagas) * valorCadaParcela;
        
        System.out.println("Total em dinheiro ja pago pelo cliente: " + valorTotal);
        System.out.println("Cliente ainda esta devendo : " + aindaDevendo);
    }
}
