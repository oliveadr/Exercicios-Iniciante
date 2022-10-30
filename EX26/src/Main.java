/*
* Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
* Caso o usuário digite um número que não esteja neste intervalo,
* exibir a seguinte mensagem: número inválido;
*  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero entre 1 e 5:");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("quatro");
                break;
            default:
                System.out.println("numero invalido");
        }

    }
}