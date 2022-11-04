/*
* Escreva um algoritmo que leia três valores inteiros e verifique se eles
* podem ser os lados de um triângulo.
* Se forem, informar qual o tipo de triângulo que eles formam:
* equilátero, isóscele ou escaleno.
* Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    b. Triângulo Isósceles: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isósceles;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("informe o lado A");
        a = sc.nextInt();
        System.out.println("informe o lado B");
        b = sc.nextInt();
        System.out.println("informe o lado C");
        c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("equilatero");
        } else if (a==b || b==c || a==c){
            System.out.println("isosceles");
        } else {
            System.out.println("escaleno");
        }

    }
}