import java.util.Scanner;

public class dois_logins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, senha;

        System.out.print("Usuário: ");
        usuario = sc.nextLine();

        System.out.print("Senha: ");
        senha = sc.nextLine();

        if ((usuario.equals("atila") && senha.equals("12345")) ||
                (usuario.equals("olivi") && senha.equals("54321"))) {

            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Usuário e senha não conferem");
        }

        sc.close();
    }
}