import static java.lang.IO.*;

void main() {
    print("---tabuada---");
    print("digite o numero inteiro para a tabuada");
    int num = Integer.parseInt(readln());
    int i =1;
     do {
         print(i + " x " + num + " = " + (i * num) + "  ");
         i++;
     } while(i <= 10);

}