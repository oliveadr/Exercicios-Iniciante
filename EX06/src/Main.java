import java.util.Scanner;
/*
* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma
* que a variávelA passe a possuir o valor da variável B e a
* variável B passe a possuir o valor da variável A.
* Apresentar os valores trocados;
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("digite o valor de B:");
        int b = sc.nextInt();
        System.out.println("A recebe: " + a + " e B recebe: "  + b);
        int a1 = b;
        int b1 = a;
        a = b;
        System.out.println("A ficou: " + a + "B ficou: " +b);
        b = b1;
        System.out.println("até");
    }
}