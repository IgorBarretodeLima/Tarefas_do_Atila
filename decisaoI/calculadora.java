import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;
        int op;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("1-Adição 2-Subtração 3-Multiplicação 4-Divisão");
        System.out.println("5-Potência 6-Raiz quadrada 7-Par 8-Ímpar");
        op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Resultado: " + (n1 + n2)); break;
            case 2: System.out.println("Resultado: " + (n1 - n2)); break;
            case 3: System.out.println("Resultado: " + (n1 * n2)); break;
            case 4: System.out.println("Resultado: " + (n1 / n2)); break;
            case 5: System.out.println("Resultado: " + Math.pow(n1, n2)); break;
            case 6: System.out.println("Raiz de n1: " + Math.sqrt(n1)); break;
            case 7: System.out.println((n1 % 2 == 0) ? "n1 é par" : "n1 é ímpar"); break;
            case 8: System.out.println((n1 % 2 != 0) ? "n1 é ímpar" : "n1 é par"); break;
            default: System.out.println("Opção inválida");
        }

        sc.close();
    }
}
