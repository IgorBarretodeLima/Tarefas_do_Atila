import static java.lang.IO.*;

void main() {
    print("---tabuada---");
    print("digite o numero inteiro para a tabuada");
    int num =  Integer.parseInt(readln());
    for (int i = 1; i <= 10; i++) {
        print(i + " x " + num + " = " + (i * num) + "  ");
    }


}