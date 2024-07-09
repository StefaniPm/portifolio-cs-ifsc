/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio9 {
    import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados da conta bancária
        System.out.print("Digite o número da conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo atual da conta bancária: ");
        double saldoAtual = scanner.nextDouble();

        System.out.print("Digite o tipo de operação a ser realizada (1 - depósito ou 2 - saque): ");
        int tipoOperacao = scanner.nextInt();

        System.out.print("Digite o valor da operação: ");
        double valorOperacao = scanner.nextDouble();

        // Verificação e cálculo do novo saldo
        double novoSaldo;
        if (tipoOperacao == 1) { // Depósito
      

}
