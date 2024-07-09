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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] nota = {'A', 'B', 'C', 'D'};
        char opniao;
        String[] opnião = {"Ótimo", "Bom", "Regular", "Ruim"};
        int idade, respostas, dif, menid, maiid, mid, respruim;
        int soma = 0;
        respruim = 0;
        respostas = 0;
        menid = 0;
        maiid = 0;
        idade = 0;
        System.out.println("Questionario");
        System.out.println("Nota\tOpnião");
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i] + "\t" + opnião[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Informe sua opnião sobre o filme conforme a tabela: ");
            opniao = entrada.next().charAt(0);
            if (idade < menid) {
                menid = idade;
            }
            if (idade > maiid) {
                maiid = idade;
            }
            if (opniao == 'A') {
                respostas++;
            }
            if (opniao == 'D') {
                respruim++;
                soma += idade;

            }
        }
        dif = maiid - menid;
        mid = idade / respruim;
        System.out.println("A quantidade de respostas otimo eh de: " + respostas);
        System.out.println("A media de idade das pessoas que responderam ruim eh de: " + mid);
        System.out.println("a diferença entre a maior idade e a menor idade eh de: " + dif);
    }
}
