/*
* A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros.
* Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        int valor = sc.nextInt();
        int prestacao = valor / 5;
        System.out.println("O valor das prestacoes: 5x de " + prestacao);

    }
}