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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cpf;
        double renda, desconto, aplic;
        char clas;
        char[] classe={'A', 'B', 'C', 'D','E'};
        String[] aliquota={"insento", "5%", "10&", "15%","20%"};
        int idade, respostas, dif, menid, maiid, mid, respruim, soma;
        System.out.println("descontos");
        System.out.println("Classe\tAliquotas");
        for (int i=0; i<classe.length;i++){
            System.out.println(classe[i]+"\t"+aliquota[i]);
        }
        do{
            System.out.println("informe seu CPF: ");
            cpf=entrada.next();
            System.out.println("informe sua renda mendal: ");
            renda=entrada.nextDouble();
            System.out.println("informe sua classe de renda: ");
            clas=entrada.next().charAt(0);
            switch (clas){
            case 'A': 
                System.out.println("não ha desconto nessa classe: ");
                break;
            case 'B':
                System.out.println("o desconto sera de:  "+renda*5/100);
                break;
            case 'C':
                System.out.println("o desconto sera de:  "+renda*10/100);
                break;
            case 'D':
                System.out.println("o desconto sera de:  "+renda*15/100);
                break;
            case 'E':
                System.out.println("o desconto sera de:  "+renda*20/100);
                break;
        }   
        } while (cpf!="00");
    }
}
