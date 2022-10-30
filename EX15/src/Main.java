import java.util.Scanner;

/*
* Faça um algoritmo que receba um número e diga se este número
*  está no intervalo entre 100 e 200;
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        if(valor>=100&&valor<=200){
            System.out.println("o valor ta no intervalo");
        }else {
            System.out.println("n ta no intervalo");
        }
    }
}