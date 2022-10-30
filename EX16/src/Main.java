/*
* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
* Calcular a sua média (aritmética), informar o nome e sua menção
* aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o nome do aluno");
        String nome = sc.next();
        System.out.println("informe as 3 notas obtidas durante o semestre: ");
        int primeiraNota = sc.nextInt();
        int segundaNota = sc.nextInt();
        int terceiraNota = sc.nextInt();
        int media = (primeiraNota + segundaNota + terceiraNota)/3;
        System.out.println(media);
        if(media >= 7){
            System.out.println("Aprovado");
        } else if (media <= 5) {
            System.out.println("Reprovado");
        } else if (media >= 5.1  || media <= 6.9) {
            System.out.println("Recuperacao");
        }
    }
}