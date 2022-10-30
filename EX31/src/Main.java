/*
* Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
* pede-se para imprimir o resultado da operação de A por B se C
* for um símbolo de operador aritmético;
* caso contrário deve ser impressa uma mensagem de operador não definido.
* Tratar erro de divisão por zero;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,valor;
        char c;
        System.out.println("informe o primeiro numero:");
        a = sc.nextDouble();
        System.out.println("informe o operador (+ - * ou /): ");
        c = sc.next().charAt(0);
        System.out.println("informe o segundo numero: ");
        b = sc.nextDouble();

        switch (c){
            case '+':
              valor = a + b;
              System.out.println(valor);
            break;
            case '-':
              valor = a - b;
              System.out.println(valor);
              break;
            case '*':
              valor = a * b;
              System.out.println(valor);
              break;
            case '/':
              valor = a / b;
              System.out.println(valor);
              break;
        }
        if(c!= '*' && c!='/'&& c!='+' && c!='-'){
            System.out.println("operador n definido!");
        } else if (b==0) {
            System.out.println("n pode dividir por zero!");
        }

    }
}