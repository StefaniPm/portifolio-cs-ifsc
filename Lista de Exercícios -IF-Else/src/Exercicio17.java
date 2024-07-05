/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author HP_ISMAEL
 */
public class Exercicio17 {
    import java.util.Scanner;

public class CalculadoraPesoPlaneta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do peso na Terra e código do planeta
        System.out.print("Digite o peso na Terra (em kg): ");
        double pesoTerra = scanner.nextDouble();

        System.out.println("Códigos dos planetas:");
        System.out.println("1. Mercúrio");
        System.out.println("2. Vênus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Netuno");
        System.out.print("Digite o código do planeta: ");
        int codigoPlaneta = scanner.nextInt();

        // Constantes de gravidade relativa dos planetas em relação à Terra
        final double GRAVIDADE_MERCURIO = 0.37;
        final double GRAVIDADE_VENUS = 0.88;
        final double GRAVIDADE_MARTE = 0.38;
        final double GRAVIDADE_JUPITER = 2.64;
        final double GRAVIDADE_SATURNO = 1.15;
        final double GRAVIDADE_URANO = 1.17;
        final double GRAVIDADE_NETUNO = 1.18;

        // Cálculo do peso no planeta selecionado
        double pesoPlaneta;
        switch (codigoPlaneta) {
            case 1:
                pesoPlaneta = pesoTerra * GRAVIDADE_MERCURIO;
                System.out.println("O peso no planeta Mercúrio é: " + pesoPlaneta + " kg");
                break;
            case 2:
                pesoPlaneta = pesoTerra * GRAVIDADE_VENUS;
                System.out.println("O peso no planeta Vênus é: " + pesoPlaneta + " kg");
                break;
            case 3:
                pesoPlaneta = pesoTerra * GRAVIDADE_MARTE;
                System.out.println("O peso no planeta Marte é: " + pesoPlaneta + " kg");
                break;
            case 4:
                pesoPlaneta = pesoTerra * GRAVIDADE_JUPITER;
                System.out.println("O peso no planeta Júpiter é: " + pesoPlaneta + " kg");
                break;
            case 5:
                pesoPlaneta = pesoTerra * GRAVIDADE_SATURNO;
                System.out.println("O peso no planeta Saturno é: " + pesoPlaneta + " kg");
                break;
            case 6:
                pesoPlaneta = pesoTerra * GRAVIDADE_URANO;
                System.out.println("O peso no planeta Urano é: " + pesoPlaneta + " kg");
                break;
            case 7:
                pesoPlaneta = pesoTerra * GRAVIDADE_NETUNO;
                System.out.println("O peso no planeta Netuno é: " + pesoPlaneta + " kg");
                break;
            default:
                System.out.println("Código de planeta inválido!");
        }

        scanner.close();
    }
}

}
