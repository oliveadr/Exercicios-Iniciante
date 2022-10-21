import java.util.Scanner;
/*
* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
* A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a
* temperatura em Celsius;
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("digite a temperatura pra conversao");
        System.out.println("Celsius: ");
        double c = sc.nextDouble();
        double f = (9*c+160) / 5;
        System.out.println("a temp em Farenheit e: " + f);


    }
}