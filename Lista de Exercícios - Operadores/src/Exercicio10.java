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
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double tamanhoPista, pesoAviao;
        int visibilidade, chuva, passageiros;
        boolean sistemaDecolagem;
        
        System.out.print("Informe o tamanho da pista: ");
        tamanhoPista = scanner.nextDouble();
        
        System.out.print("Informe o peso do aviao: ");
        pesoAviao = scanner.nextDouble();
        
        System.out.print("Informe a visibilidade: ");
        visibilidade = scanner.nextInt();
        
        System.out.print("Informe a intensidade da chuva: ");
        chuva = scanner.nextInt();
        
        System.out.print("Informe a quantidade de passageiros: ");
        passageiros = scanner.nextInt();
        
        System.out.print("Possui Sistema de decolagem?");
        sistemaDecolagem = scanner.nextBoolean();
        
        if(tamanhoPista < 1.5 && pesoAviao < 40){
            System.out.println("Pode voar meu filho");
        } else if(tamanhoPista >= 1.5 && tamanhoPista <= 2 && pesoAviao <= 60){
            System.out.println("Pode voar meu filho");            
        } else if(visibilidade < 20 && !sistemaDecolagem){
            System.out.println("Nao pode voar, vicibilidade baixa");
        } else if(passageiros > 100 && chuva > 0){
            System.out.println("Nao pode voar por causa da quantidade de passageiros e chuva");
        } else {
            System.out.println("Pode voar meu filho");
        }
    }
}
