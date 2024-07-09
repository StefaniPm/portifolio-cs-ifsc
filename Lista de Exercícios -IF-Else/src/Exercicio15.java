/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio15 {
    import java.util.Scanner;

public class ClassificadorNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade do nadador
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        // Classificação do nadador
        String categoria;
        if (idade >= 5 && idade <= 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 17) {
            categoria = "Juvenil";
        } else if (idade >= 18 && idade <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }

        // Impressão da categoria do nadador
        System.out.println("O nadador está na categoria: " + categoria);

        scanner.close();
    }
}

}
