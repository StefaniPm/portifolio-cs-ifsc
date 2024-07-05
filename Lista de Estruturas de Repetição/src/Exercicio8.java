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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char bil, confirmacao;
        int id, vend, venda, vendi;
        char[] tipo = {'A', 'B', 'C', 'D'};
        String[] idade = {"inferior a 6", "entre 6 e 12", "entre 12 e 65", "mais de 65"};
        String[] bilhete = {"insento de pagamento", "biblhete de criança", "bilhete normal", "bilhete de 3°idade"};
        System.out.println("Tipo\tValor da Diaria");
        for (int i = 0; i < tipo.length; i++) {
            System.out.println(tipo[i] + "\t" + idade[i] + "\t" + bilhete[i]);
        }
        do {
            System.out.println("Informe sua idade");
            id = entrada.nextInt();
            if (id < 6) {
                bil = 'A';
                System.out.println("o bilehte deverá ser do tipo: " + bil);
            }
            if (id >= 6 && id <= 12) {
                bil = 'B';
                System.out.println("o bilehte deverá ser do tipo: " + bil);
            }
            if (id > 12 && id <= 65) {
                bil = 'C';
                System.out.println("o bilehte deverá ser do tipo: " + bil);
            }
            if (id > 65) {
                bil = 'D';
                System.out.println("o bilehte deverá ser do tipo: " + bil);
            }
            System.out.println("deseja continuar: ");
            confirmacao = entrada.next().charAt(0);
        } while (confirmacao == 's' || confirmacao == 'S');
    }
}
