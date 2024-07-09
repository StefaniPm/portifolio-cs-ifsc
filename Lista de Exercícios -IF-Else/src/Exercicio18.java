/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio18 {
    import java.util.Scanner;

public class CreditoEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do saldo médio do cliente
        System.out.print("Digite o saldo médio do cliente no último ano: ");
        double saldoMedio = scanner.nextDouble();

        // Cálculo do valor do crédito de acordo com a tabela
        double valorCredito;
        if (saldoMedio <= 200) {
            valorCredito = saldoMedio * 0.1; // 10% do saldo médio
        } else if (saldoMedio <= 300) {
            valorCredito = saldoMedio * 0.2; // 20% do saldo médio
        } else if (saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.25; // 25% do saldo médio
        } else {
            valorCredito = saldoMedio * 0.3; // 30% do saldo médio
        }

        // Impressão do saldo médio e valor do crédito
        System.out.printf("O saldo médio do cliente no último ano foi: R$ %.2f\n", saldoMedio);
        System.out.printf("O valor do crédito especial é: R$ %.2f\n", valorCredito);

        scanner.close();
    }
}

}
