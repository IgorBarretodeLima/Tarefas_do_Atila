import java.util.Scanner;

public class validar_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = sc.nextLine();

        if (texto.trim().isEmpty()) {
            System.out.println("Dado inválido");
        } else {
            System.out.println(texto);
        }

        sc.close();
    }
}