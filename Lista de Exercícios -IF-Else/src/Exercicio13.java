/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio13 {
    import java.util.Scanner;

public class VerificadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome e quantidade em estoque de três produtos
        String[] produtos = new String[3];
        int[] estoque = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade em estoque do produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
        }

        // Verificação dos produtos abaixo do estoque mínimo
        System.out.println("Produtos abaixo do estoque mínimo (30 unidades):");
        f

}
