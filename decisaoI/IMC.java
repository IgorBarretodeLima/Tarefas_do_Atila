import static java.lang.IO.print;


void main() {
    print("Qual é sua altura metros?");
    double altura = Double.parseDouble(IO.readln());

    print("Qual é sua massa em kilograma");
    double massa = Double.parseDouble(IO.readln());

    double massa2 = Math.pow(altura,2);

    double imc = massa / massa2;

    if (imc>30){
        print("Você está obeso");
    } else if(imc>25) {
        print("Você está sobrepeso");
    } else if(imc>18.5){
        print("Você está no peso ideal");
    } else  {
        print("Você está em estado de magreza");
    }

}