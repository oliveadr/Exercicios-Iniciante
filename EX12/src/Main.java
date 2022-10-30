/*
* O custo de um carro novo ao consumidor é a soma do custo de fábrica
* mais o percentual do distribuidor e dos impostos aplicados
* (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
* do distribuidor sobre o resultado).
* Supondo que o percentual do distribuidor seja de 28% e os impostos
* 45%, escreva um algoritmo que leia o custo de fábrica de um carro e
* informe o custo ao consumidor do mesmo;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float custoFabrica ;
        System.out.println("informe o custo de fabrica: ");
        custoFabrica = sc.nextFloat();
        custoFabrica = custoFabrica * (float)0.45 + custoFabrica;
        custoFabrica = custoFabrica + ((float) 0.28 * custoFabrica);


        System.out.println("custo final: " + custoFabrica );



    }
}