import java.util.Scanner;
import java.util.stream.IntStream;

public class Validador_de_CPF {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) { //Try: "Tente executar isso".
            System.out.print("Digite o CPF: ");
            String entrada = scanner.nextLine();

            String resultado = validarCPF(entrada) ? "✅ CPF válido!" : "❌ CPF inválido!";
            System.out.println(resultado);
        }
    }

    public static boolean validarCPF(String rawCpf) {
        String cpf = rawCpf.replaceAll("\\D", "");//O que faz: Se o usuário digitar 123.456.789-10, o \\D (que significa "tudo que não é dígito") limpa os pontos e o traço, deixando apenas 12345678910.

        if (cpf.length() != 11 || cpf.chars().allMatch(c -> c == cpf.charAt(0))) {
            return false;//return como um porteiro.ele já barra o processo e retorna false imediatamente, sem precisar fazer as contas matemáticas difíceis
        }

        int dv1 = calcularDigito(cpf.substring(0, 9), 10);
        int dv2 = calcularDigito(cpf.substring(0, 10), 11);

        return cpf.equals(cpf.substring(0, 9) + dv1 + dv2);
    }

    private static int calcularDigito(String str, int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < str.length(); i++) {
            soma += Character.getNumericValue(str.charAt(i)) * (pesoInicial - i);
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto; //O ponto de interrogação ele pergunta: "Essa condição é verdadeira?"

    }
}
//como funciona o valor do cpf
//O valor de um CPF não é aleatório. Ele é construído sobre uma base lógica matemática para evitar erros de digitação e fraudes simples. Dos 11 números, os 9 primeiros são o corpo do documento e os 2 últimos são os Dígitos Verificadores (DV).
//Aqui está o "passo a passo" técnico de como o valor é gerado e validado:
//1. A Estrutura dos 11 Dígitos
//Os 8 primeiros dígitos: São números sequenciais gerados pela Receita Federal.
//O 9º dígito: Indica a Região Fiscal onde o CPF foi emitido (ex: 8 é São Paulo, 7 é Rio de Janeiro).
//O 10º e 11º dígitos: São os Dígitos Verificadores, calculados através de uma fórmula matemática chamada Módulo 11.
//2. Como os Dígitos Verificadores são calculados
//O seu código faz exatamente esse processo. Imagine que o CPF seja ABC.DEF.GHI−JK.
//Para achar o J (10º dígito):
//Multiplicamos os 9 primeiros números por uma sequência decrescente de 10 a 2.
//Somamos todos os resultados.
//Dividimos a soma por 11 e pegamos o resto.
//Regra do Módulo 11:
//Se o resto for 0 ou 1, o dígito J é 0.
//Se o resto for de 2 a 10, o dígito J é o resultado de 11−resto.
//Para achar o K (11º dígito):
//O processo se repete, mas agora incluímos o J (que acabamos de calcular) na conta:
//Multiplicamos os 10 primeiros números por uma sequência decrescente de 11 a 2.
//Somamos, dividimos por 11 e pegamos o resto.
//Aplicamos a mesma regra: se o resto for < 2, o dígito é 0; senão, é 11−resto.
//3. Por que certos números "não funcionam"?
//Como você notou com o número 20285296374, ele deu "inválido". Isso acontece porque, ao fazer a conta acima com os números 202852963, o resultado matemático dos dígitos finais não foi 74.
//Se você alterar qualquer um dos 11 números, a conta "quebra". É por isso que o CPF é um sistema tão seguro contra erros: se você digitar um único número errado, os dois últimos dígitos não vão bater com o cálculo, e o sistema saberá na hora que o documento é falso ou foi digitado incorretamente.