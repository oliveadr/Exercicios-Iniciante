/*
* Faça um algoritmo que receba um número e mostre uma mensagem caso este número segue
* maior que 80, menor que 25 ou igual a 40;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero<=25){
            System.out.println("menor que 25");
        } else if (numero == 40) {
            System.out.println("igual a 40");
        } else if (numero>=80) {
            System.out.println("maior que 80");
        }
    }
}