import java.util.Scanner;

public class notaEstadunidense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;
        char conceito;

        if (media >= 9)
            conceito = 'A';
        else if (media >= 7.5)
            conceito = 'B';
        else if (media >= 6)
            conceito = 'C';
        else if (media >= 4)
            conceito = 'D';
        else
            conceito = 'E';

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C')
            System.out.println("APROVADO");
        else
            System.out.println("REPROVADO");

        sc.close();
    }
}