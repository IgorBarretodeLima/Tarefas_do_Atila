import java.util.Scanner;

public class Maior_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        int soma = num1 + num2 + num3;
        double media = soma / 3.0;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}