import java.util.Scanner;

public class TiposdeTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o lado A: ");
        a = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        b = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("Triângulo Equilátero");
            else if (a == b || a == c || b == c)
                System.out.println("Triângulo Isósceles");
            else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não forma um triângulo");
        }

        sc.close();
    }
}