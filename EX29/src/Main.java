/*Faça um algoritmo que receba o número do mês e mostre o mês correspondente.
* Valide mês inválido;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        System.out.println("informe o numero do mes");
        switch (mes){
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
            break;
            case 3:
                System.out.println("marco");
            break;
            case 4:
                System.out.println("abril");
            break;
            case 5:
                System.out.println("maio");
            break;
            case 6:
                System.out.println("junho");
            break;
            case 7:
                System.out.println("julho");
            break;
            case 8:
                System.out.println("agosto");
            break;
            case 9:
                System.out.println("setembro");
            break;
            case 10:
                System.out.println("outubro");
            break;
            case 11:
                System.out.println("novembro");
            break;
            case 12:
                System.out.println("dezembro");
            break;
            default:
                System.out.println("mes invalido");

        }
    }
}