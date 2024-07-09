package listaaula05;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prova1, prova2, trabalho, frequencia;
        boolean aprovado;

        System.out.print("Informe a nota da prova 1: ");
        prova1 = scanner.nextInt();

        System.out.print("Informe a nota da prova 2: ");
        prova2 = scanner.nextInt();

        System.out.print("Informe a nota do trabalho: ");
        trabalho = scanner.nextInt();

        System.out.print("Informe a frequencia do aluno: ");
        frequencia = scanner.nextInt();

        aprovado = trabalho >= 7 && (prova1 >= 6 || prova2 >= 6) && frequencia >= 75 || trabalho == 6 && frequencia >= 90;                           

        System.out.println(aprovado);
    }
}
