/*
* A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
* Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
* O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível
* (álcool – 25%, gasolina – 21% ou diesel –14%).
* Com valor do veículo zero encerra entrada de dados.
* Informe total de desconto e total pago pelos clientes;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorPago, valorVeiculo;
        String combustivel;

        do {
            System.out.println("informe o tipo de combustivel: ");
            combustivel = sc.next();
            System.out.println("informe o valor do veiculo:  (aperte 0 p/ sair)");
            valorVeiculo = sc.nextDouble();

            switch (combustivel) {
                case "alcool":
                    valorPago = valorVeiculo - (0.25 * valorVeiculo);
                    System.out.println("valor pago c/ desconto: " + valorPago);
                    break;
                case "gasolina":
                    valorPago = valorVeiculo - (0.21 * valorVeiculo);
                    System.out.println("valor pago c/ desconto: " + valorPago);
                    break;
                case "diesel":
                    valorPago = valorVeiculo - (0.14 * valorVeiculo);
                    System.out.println("valor pago c/ desconto: " + valorPago);
                    break;
                }
        } while (valorVeiculo != 0);

    }
}