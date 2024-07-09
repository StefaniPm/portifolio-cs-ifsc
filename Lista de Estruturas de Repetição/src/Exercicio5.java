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
public class Exercicio5 {

    public static void main(String[] args) {
        double alt, altt, medt, medm, malt;
        malt = 0;
        altt = 0;
        medm = 0;
        int gen, m;
        m = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe sua altura: ");
            alt = entrada.nextDouble();
            System.out.println("Informe o código para genero: 1-masculino; 2-feminino");
            gen = entrada.nextInt();
            if (alt > malt) {
                malt = alt;
            }
            altt += alt;
            if (gen == 2) {
                medm += alt;
                m++;
            }
        }
        medm = medm / m;
        medt = altt / 10;
        System.out.println("A maior altura da turma eh: " + malt);
        System.out.println("A média de altura das mulheres eh: " + medm);
        System.out.println("A media da turma eh: " + medt);
    }
}
