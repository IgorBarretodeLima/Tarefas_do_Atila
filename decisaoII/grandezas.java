import java.util.Scanner;

public class grandezas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;


        System.out.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
        System.out.println("1. Tensão (Volt)");
        System.out.println("2. Resistência (Ohm)");
        System.out.println("3. Corrente (Ampére)");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Resistência: ");
                double R = sc.nextDouble();
                System.out.print("Corrente: ");
                double I = sc.nextDouble();
                System.out.println("Tensão = " + (R * I));
                break;

            case 2:
                System.out.print("Tensão: ");
                double U = sc.nextDouble();
                System.out.print("Corrente: ");
                I = sc.nextDouble();
                System.out.println("Resistência = " + (U / I));
                break;

            case 3:
                System.out.print("Tensão: ");
                U = sc.nextDouble();
                System.out.print("Resistência: ");
                R = sc.nextDouble();
                System.out.println("Corrente = " + (U / R));
                break;

            case 4:
                System.out.println("Encerrando...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}