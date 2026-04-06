import java.util.Scanner;

public class turnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite M, V ou N: ");
        char turno = sc.next().charAt(0);

        switch (turno) {
            case 'M': System.out.println("Bom Dia!"); break;
            case 'V': System.out.println("Boa Tarde!"); break;
            case 'N': System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor Inválido!");
        }

        sc.close();
    }
}
