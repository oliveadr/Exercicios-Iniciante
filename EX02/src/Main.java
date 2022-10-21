import java.util.Scanner;
/*
* Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
* dos dois números lidos;
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma, subtracao, multiplicacao, divisao;
        System.out.println("digite 2 numeros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }

}
