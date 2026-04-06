import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade em Km/h: ");
        int velocidade = sc.nextInt();

        int limite = 80;

        if (velocidade > limite) {
            int excedeu = velocidade - limite;
            double multa = excedeu * 50.0;

            System.out.println("Limite = 80Km/h");
            System.out.println("Excedeu " + excedeu + "Km/h");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Dentro do limite permitido.");
        }

        sc.close();
    }
}