
package listaaula05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prova1, prova2, trabalho;
        boolean aprovado;

        System.out.print("Informe a nota da prova 1: ");
        prova1 = scanner.nextInt();

        System.out.print("Informe a nota da prova 2: ");
        prova2 = scanner.nextInt();

        System.out.print("Informe a nota do trabalho: ");
        trabalho = scanner.nextInt();

        aprovado = (trabalho >= 7 && (prova1 >= 6 || prova2 >= 6));

        System.out.println(aprovado);
    }
}
