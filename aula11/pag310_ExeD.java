import static java.lang.IO.*;

void main() {
    int soma =0;
    int i =1;
    do {

        if(i % 2 ==0){
            soma = soma +1;
        }
        i++;
    } while(i <= 500);
    print(soma);
}