import java.util.Scanner;

public class black_friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, desconto = 0;
        int codigo;

        System.out.print("Valor da compra: ");
        valor = sc.nextDouble();

        System.out.print("Forma de pagamento (1-4): ");
        codigo = sc.nextInt();

        switch (codigo) {
            case 1: desconto = 0.10; break;
            case 2: desconto = 0.05; break;
            case 3: desconto = 0.03; break;
            case 4: desconto = 0.075; break;
            default:
                System.out.println("Código inválido!");
                return;
        }

        double finalValor = valor - (valor * desconto);
        System.out.println("Valor final: R$ " + finalValor);

        sc.close();
    }
}