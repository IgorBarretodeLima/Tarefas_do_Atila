import java.util.Scanner;

public class decs_combustiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double litros, preco = 0, desconto = 0;
        char tipo;

        System.out.print("Litros: ");
        litros = sc.nextDouble();

        System.out.print("Tipo (A/G): ");
        tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'A') {
            preco = 2.89;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            preco = 4.95;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        }

        double total = litros * preco;
        total -= total * desconto;

        System.out.println("Valor a pagar: R$ " + total);

        sc.close();
    }
}