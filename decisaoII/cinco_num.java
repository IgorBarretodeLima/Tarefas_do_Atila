import java.util.Scanner;

public class cinco_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            System.out.println("Número: " + num);
        }

        sc.close();
    }
}