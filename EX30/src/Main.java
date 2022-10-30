/*
 * Escreva um algoritmo que leia três valores inteiros distintos
 * e os escreva em ordem crescente;
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("informe tres numeros");
        int numero[]= new int[3];
        for(int i = 0; i<3; i++){
            numero[i] = sc.nextInt();

        }
        Arrays.sort(numero);
        System.out.println(Arrays.toString(numero));



    }
}