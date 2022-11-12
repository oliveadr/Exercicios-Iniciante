/*
* Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
* Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
* Tipo de Cliente Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o tipo de cliente:");
        String cliente = sc.next();
        System.out.println("informe as qtds de KW/h consumidos:");
        double valor = sc.nextDouble();
        double total = 0;
        // comparacao if com string usa o metodo var.equals
        if (cliente.equals("residencia")){
            total = valor * 0.60;

        } else if (cliente.equals("comercio")) {
            total = valor * 0.48;

        } else if (cliente.equals("industria")) {
            total= valor * 1.29;

        }

        System.out.println("total: " + total);

    }
}