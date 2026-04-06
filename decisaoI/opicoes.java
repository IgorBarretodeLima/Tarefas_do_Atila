import java.util.Scanner;

public class opicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - trabalho");
        System.out.println("2 - casa");
        System.out.println("3 - senai");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção: ");

        int op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Você selecionou a trabalho"); break;
            case 2: System.out.println("Você selecionou a casa"); break;
            case 3: System.out.println("Você selecionou a senai"); break;
            case 4: System.out.println("Você selecionou sair"); break;
            default: System.out.println("Opção inválida!!!");
        }

        System.out.println("Fim do programa!");
        sc.close();
    }
}