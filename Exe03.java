import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = scanner.nextInt();

        System.out.println("A soma dos três números é: " + Somar(n1,n2,n3));
        scanner.close();
    }

    public static int Somar(int n1, int n2, int n3) {
        return (n1 + n2 + n3);
    }
}
