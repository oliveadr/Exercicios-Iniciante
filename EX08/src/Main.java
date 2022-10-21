import java.util.Scanner;

/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$)
de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
 também a quantidade de dólares disponíveis com o usuário cotacao dolar 5,22
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a cotacao do dolar U$?");
        double dolar = sc.nextDouble();
        System.out.println("Quantos dolares serao convertidos?");
        double quantidade = sc.nextDouble();
        double conversao = dolar*quantidade;
        System.out.println("A conversao fica: " + conversao + "R$");


    }
}