
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("insira seu nome:");
         String nome = scanner.nextLine();
    
         System.out.println("insira seu endere�o:");
         String endere�o = scanner.nextLine();
         
         System.out.println("Insira o seu telefone");
         String telefone = scanner.nextLine();
         
         System.out.println("Nome: " + nome);
         System.out.println("Endere�o: " + endere�o);
         System.out.println("telefone: " + telefone);
         scanner.close();
}}
    
