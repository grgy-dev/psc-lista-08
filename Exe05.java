import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double imposto, custoItem;

        System.out.print("Digite a taxa do imposto (em %): ");
        imposto = scanner.nextDouble();
        System.out.print("Digite o custo do item: R$");
        custoItem = scanner.nextDouble();

        System.out.println("Valor final do item: " + somaImposto(imposto, custoItem));
        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double impostoCalculado = 0, valorFinal = 0;
        impostoCalculado = (taxaImposto / 100) * custo;
        valorFinal = custo + impostoCalculado;
        
        return valorFinal;
    }
}
