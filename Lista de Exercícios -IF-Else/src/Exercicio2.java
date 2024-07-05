
package aula08;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas das duas provas e do trabalho
        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        // Verificação se o aluno foi aprovado
        if (notaTrabalho >= 7 && (notaProva1 >= 6 || notaProva2 >= 6)) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você não foi aprovado.");
        }

        scanner.close();
    }
}


