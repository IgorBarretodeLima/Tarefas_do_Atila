import static java.lang.IO.*;

void main() {
    int soma= 0 ;
    int maior = 0 ;
    int menor = 0;
    int pares=0;
    int impares=0;
    int i =1;
    float media = 0;
for ( i =1; i <= 10; i++) {
    int num = Integer.parseInt(readln("digite um numero"));
    soma += num;
    if (num % 2 == 0) {
        pares += 1;
    } else {
        impares += 1;

    }
    if (i == 1) {
        maior = num;
        menor = num;
    }
    if (num > maior) {
        maior = num;
    }
    if (num < menor) {
        menor = num;
    }
}

media = (float)soma / 10 ;

print("o maior foi" + maior);
    print("o menor foi" + menor);
    print("o media foi" + media);
    print("o soma foi" + soma);
    print("o impares foi" + impares);
    print("o pares foi" + pares);
}