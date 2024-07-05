/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio3 {
    
}
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do peso e altura da pessoa
        System.out.print("Digite o peso (em Kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Determinação da situação da pessoa
        String situacao;
        if (imc < 20) {
            situacao = "magro";
        } else if (imc >= 20 && imc < 25) {
            situacao = "normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "sobrepeso";
        } else {
            situacao = "obeso";
        }

        // Impressão do IMC e da situação da pessoa
        System.out.println("O seu IMC é: " + imc);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
