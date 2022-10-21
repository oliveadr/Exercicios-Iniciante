import java.util.Scanner;

/*
*  Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
*  total percorrida pelo automóvel e o total de combustível gasto;
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia, combustivel;
        System.out.println("Digite o valor da distancia percorrida");
        distancia = sc.nextInt();
        System.out.println("Digite o valor do combustivel gasto");
        combustivel = sc.nextInt();
        double consumoMedio = combustivel / distancia ;
        System.out.printf("O consumo foi de: %2f", consumoMedio);

    }
}
