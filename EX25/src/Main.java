/*
* Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
* Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
* Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("informe o segundo numero");
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("iguais");
        } else  {
            System.out.println("diferentes");
        }
        if (num1>num2) {
            System.out.println("primeiro numero maior ");
        }else if(num2>num1) {
            System.out.println("segundo numero maior");
        }
    }
}