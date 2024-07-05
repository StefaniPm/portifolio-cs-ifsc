/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] itens = {"Cachorro quente", "X Salada", "Bauru com ovo", "Refrigerante"};
        int[] codigos = {100, 101, 102, 103};
        double[] preços = {4.00, 6.00, 6.50, 2.00};
        System.out.println("Cardapio");
        System.out.println("Especificação\tCódigo\tPreço");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i] + "\t" + codigos[i] + "\tR$" + preços[i]);
        }
        System.out.println("Informe o código do produto desejado: ");
        int cod = entrada.nextInt();
        System.out.println("Infome a quantidade: ");
        int quant = entrada.nextInt();
        int j = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == cod) {
                j = 1;
                break;
            }
        }
        if (j != -1) {
            double valort = preços[j] * quant;
            System.out.println("\nItem pedido: " + itens[j]);
            System.out.println("Valor a ser pago: " + valort);
        } else {
            System.out.println("Código do pedido invalido.");
        }
    }
}
