/*
* Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e
* informe o nome e se ela é homem ou mulher.
* No final informe total de homens e de mulheres
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade, contador1 = 0, contador2 = 0;
        char genero;
        for(int i = 0; i<56; i ++){
            System.out.println("informe nome: ");
            nome=sc.next();
            System.out.println("informe a idade: ");
            idade = sc.nextInt();
            System.out.println("informe o genero: ");
            genero = sc.next().charAt(0);
            if(genero=='m' ){
              contador1++;
            } else if (genero =='f') {
                contador2++;
            }
        }
        System.out.println("total muie: " + contador2);
        System.out.println("total homi: " + contador1);
    }
}