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
public class Exercicio3 {

    public static void main(String[] args) {
        int idade;
        String nome, genero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("informe sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Informe seu nome");
        nome = entrada.next();
        System.out.print("Informe seu genero");
        genero = entrada.next();
        while (idade != 0) {
            System.out.println(nome + genero + --idade);
        }
    }
}
