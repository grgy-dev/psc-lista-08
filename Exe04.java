import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n1;

        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.println(ValidarNumero(n1));
        scanner.close();
    }

    public static char ValidarNumero(int n1) {
        char resposta;
        if (n1 > 0) {
            resposta = 'P';
        } else {
            resposta = 'N';
        }
        return resposta;
    }
}
