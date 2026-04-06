import java.util.Scanner;

public class ContadeAgua {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o consumo em m3: ");
        double consumo = leitor.nextDouble();
        double valorConta = 0;

        if (consumo <= 10) {
            valorConta = 22.38;
        } else if (consumo <= 20) {
            valorConta = consumo * 3.50;
        } else if (consumo <= 50) {
            valorConta = consumo * 8.75;
        } else {
            valorConta = consumo * 9.64;
        }

        System.out.printf("O valor da conta é: R$ %.2f%n", valorConta);
        leitor.close();
    }
}