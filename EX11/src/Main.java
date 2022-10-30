/*
* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
* Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado
* pelo usuário;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preco de custo do produto: ");
        float precoCusto = sc.nextFloat();
        System.out.println("Informe o valor % adicional de venda: ");
        float percentual = sc.nextFloat();
        float valorVenda = precoCusto + ((percentual/100)*precoCusto);
        System.out.println(valorVenda);

    }
}