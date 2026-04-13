import static java.lang.IO.*;

void main() {
    print("---tabuada---");
    print("digite o numero 1");
    int num =  Integer.parseInt(readln());

    for (int i = 1; i <= 100; i++) {
        print(i + " + " + num + " =  " + (i + num)+ "  \n"+"No total deu  5050"  );

    }


}