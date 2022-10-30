/* Escreva um algoritmo que leia dois valores inteiros distintos
 * e informe qual é o maior;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe dois valores: ");
        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        if(numeroUm>numeroDois){
            System.out.println("o maior e: " + numeroUm);
        } else {
            System.out.println("o maior e: " + numeroDois);
        }

    }
}