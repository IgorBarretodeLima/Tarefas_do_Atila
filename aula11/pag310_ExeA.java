import static java.lang.IO.*;

void main() {
    print("digite o numero maior ou igual que 4 e menor que 15 :");
    int num =  Integer.parseInt(readln());
    for (int i = 15; i <= 200; i++)
    {double p = Math.pow(i,2);
        print(i + " x " + num + " = " + p + "  ");
    }


}