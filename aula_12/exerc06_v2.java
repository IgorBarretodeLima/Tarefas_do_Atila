import static java.lang.IO.*;

void main() {
    int i = 1;
    int soma = 0;
    do{
        if (i % 2 == 0){
            soma += i;

        }
        i++;
    } while(i <+50);

    print("soma" + soma);
}

