
package listaaula05;

import java.util.Scanner;

public class Exercicio04 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso, altura, imc;
        boolean acimaDoPeso;

        System.out.print("Digite o peso da pessoa: ");
        peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        acimaDoPeso = imc > 25;
        
        if(imc > 25){
            System.out.println("IMC: " + imc);
            System.out.println("Acima do peso ideal: " + acimaDoPeso);
        } else {
            System.out.println("IMC: " + imc);
            System.out.println("Nao esta acima do peso: " + acimaDoPeso);
        }
    }
}
