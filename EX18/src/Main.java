/*
* Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando
*  “maior de idade” e “menor de idade” para cada pessoa.
* Considere a idade a partir de 18 anos como maior de idade;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        for (int i = 0; i<75;i++){
            idade = sc.nextInt();
            if(idade<18){
                System.out.println("menor de idade");
            } else if (idade>=18) {
                System.out.println("maior de idade");
            }
        }
    }
}