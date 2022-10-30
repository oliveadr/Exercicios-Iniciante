import java.util.Scanner;

/*
* Faça um algoritmo que receba “N”
* números e mostre positivo, negativo ou zero para cada número
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0) {
            System.out.println("numero positivo");
        } else if (num<0) {
            System.out.println("numero negativo");
        } else if (num == 0) {
            System.out.println("zero");
        }
    }
}