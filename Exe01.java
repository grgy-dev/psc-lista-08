import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        ImprimeNumeros(numero);
        scanner.close();
    }

    public static void ImprimeNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j < i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();

        }
    }
}
