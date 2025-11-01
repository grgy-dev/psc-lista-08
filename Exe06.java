import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int hora,minuto;

        do {
            System.out.print("Digite a hora (apenas hora): ");
            hora = scanner.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.print("Digite os minutos: ");
            minuto = scanner.nextInt();
        } while (minuto < 0 || minuto > 59);

        String[] resultado = converteHora(hora);

        ImprimeHora(resultado[0],minuto,resultado[1]);
        scanner.close();
    }

    public static String[] converteHora(int hora) {
        int convertido;
        char periodo;
         if (hora == 0) {
            convertido = 12; 
            periodo = 'A';
        } else if (hora < 12) {
            convertido = hora; 
            periodo = 'A';
        } else if (hora == 12) {
            convertido = hora;
            periodo = 'P';
        } else {
            convertido = hora - 12; 
            periodo = 'P';
        }
        return new String[]{String.valueOf(convertido), String.valueOf(periodo)};
    }

    public static void ImprimeHora(String hora, int minuto, String periodo) {
        System.out.printf("Hora convertida: %s:%02d %sM\n", hora, minuto, periodo);
    }
}
