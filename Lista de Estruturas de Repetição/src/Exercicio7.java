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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] tipo = {'A', 'B', 'C'};
        double[] valor = {150.00, 100.00, 75.00};
        int diarias;
        double contaf, vald;
        String nome;
        char apto;
        char confirmacao;
        System.out.println("Tipo\tValor da Diaria");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i] + "\t" + valor[i]);
        }
        do {
            System.out.println("Informe o nome do hospede");
            nome = entrada.next();
            System.out.println("Informe o tipo de apartamento");
            apto = entrada.next().charAt(0);
            System.out.println("Informe o numero de diarias");
            diarias = entrada.nextInt();
            if (apto == 'A') {
                vald = 150.00;
                contaf = diarias * vald;
                System.out.println("hospede: " + nome);
                System.out.println("tipo de aparatamento: " + apto);
                System.out.println("valor total: " + contaf);
            }
            if (apto == 'B') {
                vald = 100.00;
                contaf = diarias * vald;
                System.out.println("hospede: " + nome);
                System.out.println("tipo de aparatamento: " + apto);
                System.out.println("valor total: " + contaf);
            }
            if (apto == 'C') {
                vald = 75.00;
                contaf = diarias * vald;
                System.out.println("hospede: " + nome);
                System.out.println("tipo de aparatamento: " + apto);
                System.out.println("valor total: " + contaf);
            }
            System.out.println("deseja continuar: ");
            confirmacao = entrada.next().charAt(0);
        } while (confirmacao == 'S' || confirmacao == 's');
    }
}
