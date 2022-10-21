import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma dos numeros e: " + soma);
    }
}
