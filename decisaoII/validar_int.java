import java.util.Scanner;

public class validar_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String entrada = sc.nextLine();

        if (entrada.trim().isEmpty()) {
            System.out.println("Dado inválido");
        } else {
            int numero = Integer.parseInt(entrada);
            System.out.println(numero);
        }

        sc.close();
    }
}