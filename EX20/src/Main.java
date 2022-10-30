/*
* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
* Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente
* de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo.
* Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar
* calculando desconto até que a resposta seja: “(N) Não”.
* Informar total de carros com ano até 2000 e total geral;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Carango Velho, seja bem vindo!");
        int ano;
        float valor;
        String continuar;
        do {
            System.out.println("informe o ano do carro: ");
            ano = sc.nextInt();
            System.out.println("informe o valor do carro: ");
            valor = sc.nextFloat();
            System.out.println("deseja continuar? ");
            continuar = sc.next();
            if (ano<=2000){
                float desconto = (float) (valor *0.12);
                valor = desconto+ valor;
                System.out.println("valor do carro: " + valor);

            } else if (ano>2000) {
                float desconto = (float) (valor * 0.07);
                valor = desconto+ valor;
                System.out.println("valor do carro: " + valor);
            }
        } while (continuar =="n");




    }
}