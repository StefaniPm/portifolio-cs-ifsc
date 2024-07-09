/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaaula05;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Exericicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double provaPortu, provaMat, provaConhecimento, media;
        String nome;

        System.out.print("Informe o nome do candidato: ");
        nome = scanner.nextLine();

        System.out.print("Informe a nota da prova de Portugues: ");
        provaPortu = scanner.nextDouble();

        System.out.print("Informe a nota da prova de Matematica: ");
        provaMat = scanner.nextDouble();

        System.out.print("Informe a nota da prova de Conhecimentos Gerais: ");
        provaConhecimento = scanner.nextDouble();

        media = (provaPortu + provaMat + provaConhecimento) / 3;
        
        System.out.println("\n");

        System.out.println("Candidato: " + nome);
        System.out.println("Nota da prova de Portugues: " + provaPortu);
        System.out.println("Nota da prova de Matematica: " + provaMat);
        System.out.println("Nota da prova de Conhecimentos Gerais: " + provaConhecimento);
        System.out.println("A media das notas e: " + media + "\n");

        if (media >= 7 && provaPortu > 5 && provaMat > 5 && provaConhecimento > 5) {
            System.out.println("Candidato aprovado");
        } else {
            System.out.println("Candidato reprovado");
        }
    }
}
