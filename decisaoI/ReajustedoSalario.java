import java.util.Scanner;

public class ReajustedoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double percentual;

        if (salario <= 1000)
            percentual = 0.20;
        else if (salario <= 1700)
            percentual = 0.15;
        else if (salario <= 2300)
            percentual = 0.10;
        else
            percentual = 0.05;

        double aumento = salario * percentual;
        double novo = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Aumento (%): " + (percentual * 100));
        System.out.println("Valor aumento: " + aumento);
        System.out.println("Novo salário: " + novo);

        sc.close();
    }
}