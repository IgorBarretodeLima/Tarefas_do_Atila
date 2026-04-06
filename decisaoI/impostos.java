import java.util.Scanner;

public class impostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double inss = salario * 0.08;
        double irrf = salario * 0.15;

        System.out.println("INSS: " + inss);
        System.out.println("IRRF: " + irrf);
        System.out.println("Salário líquido: " + (salario - inss - irrf));

        sc.close();
    }
}