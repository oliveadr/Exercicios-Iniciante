import java.util.Scanner;

/*
* Faça um algoritmo que receba um número e mostre uma mensagem
* caso este número seja maior que 10;
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um numero");
        int numero = sc.nextInt();
        if (numero>10){
            System.out.println("ola");

        }
    }
}