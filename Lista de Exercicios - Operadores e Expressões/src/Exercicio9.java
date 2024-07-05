import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite a quantidade de quilos de café: ");
            double quantidadeCafe = scanner.nextDouble();
            System.out.print("Digite o custo unitário do café: R$");
            double custoUnitarioCafe = scanner.nextDouble();
           
            System.out.print("Digite a quantidade de litros de leite: ");
            double quantidadeLeite = scanner.nextDouble();
            System.out.print("Digite o custo unitário do leite: R$");
            double custoUnitarioLeite = scanner.nextDouble();
           
            System.out.print("Digite a quantidade de pacotes de bolacha: ");
            int quantidadeBolacha = scanner.nextInt();
            System.out.print("Digite o custo unitário da bolacha: R$");
            double custoUnitarioBolacha = scanner.nextDouble();
           
            double totalGastoCafe = quantidadeCafe * custoUnitarioCafe;
            double totalGastoLeite = quantidadeLeite * custoUnitarioLeite;
            double totalGastoBolacha = quantidadeBolacha * custoUnitarioBolacha;
            
            double totalGastoCompra = totalGastoCafe + totalGastoLeite + totalGastoBolacha;
            
            System.out.println("Total gasto com café: R$" + totalGastoCafe);
            System.out.println("Total gasto com leite: R$" + totalGastoLeite);
            System.out.println("Total gasto com bolacha: R$" + totalGastoBolacha);
            System.out.println("Total gasto na compra: R$" + totalGastoCompra);
            
        }
    }
}


