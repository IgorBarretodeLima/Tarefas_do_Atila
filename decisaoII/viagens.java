import java.util.Scanner;

public class viagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o quantos Km você pretende viajar: ");
        double Km = sc.nextInt();

        if(Km>=100){
            double km2 = Km * 0.5;
            System.out.print("A sua viagem ficou:" + Km);
        } else {
            double km3 = Km *45;
            System.out.print("Sua viagem ficou" + km3);

        }
        sc.close();
    }
}