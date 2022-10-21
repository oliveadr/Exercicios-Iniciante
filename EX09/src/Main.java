import java.util.Scanner;

/*
* Faça um algoritmo que receba um valor que foi depositado e exiba o valor
* com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a.m;
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor depositado?");
        double valor = sc.nextDouble();
        double rendimento = valor + (valor * 0.07);
        System.out.println(rendimento);

    }
}