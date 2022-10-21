import java.util.Scanner;
/*
* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de
* vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
* comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e
* salário no final do mês;
* */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor");
        String nomeVendedor = sc.next();
        System.out.println("Digite o salario fixo");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor R$ de vendas efetuadas esse mes");
        double vendas = sc.nextDouble();
        double salarioFinal = (0.15 * vendas)+salarioFixo;
        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Salario final: " + salarioFinal + "R$");



    }
}
