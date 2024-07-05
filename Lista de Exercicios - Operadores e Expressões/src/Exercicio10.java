import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            int quociente = numero / 2;
            
            int resto = numero % 2;
           
            System.out.println("Quociente da divisão por 2: " + quociente);
            System.out.println("Resto da divisão por 2: " + resto);
            
        }
    }
}

