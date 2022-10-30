/*
* Escreva um algoritmo para uma empresa que decide dar um reajuste a seus
* 584 funcionários de acordo com os seguintes critérios:
    a. 50% para aqueles que ganham menos do que três salários mínimos;
    b. 20% para aqueles que ganham entre três até dez salários mínimos;
    c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    d. 10% para os demais funcionários.

* Leia o nome do funcionário, seu salário e o valor do salário mínimo.
* Calcule o seu novo salário reajustado.
* Escrever o nome do funcionário, o reajuste e seu novo salário.
* Calcule quanto à empresa vai aumentar sua folha de pagamento;
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        double folhaPagamento;
        do {
            contador++;
            Scanner sc = new Scanner(System.in);
            System.out.println("informe o nome do funcionario: ");
            String nome = sc.next();
            System.out.println("informe o valor do salario: ");
            double salario = sc.nextDouble();
            System.out.println("informe o valor do salario minimo: ");
            double salarioMinimo = sc.nextDouble();
            double novoSalario, reajuste, diferenca;
            diferenca = salario / salarioMinimo;

            if (diferenca < 3) {
                //50% para aqueles que ganham menos do que três salários mínimos;
                reajuste = (0.5 * salario);
                novoSalario = salario + reajuste;
                System.out.println("houve reajuste de 50% do salario: " + "R$" + reajuste);
                System.out.println("novo valor do salario: " + "R$" + novoSalario);
            } else if (diferenca >= 3 && diferenca < 10) {
                //20% para aqueles que ganham entre três até dez salários mínimos;
                reajuste = (0.2 * salario);
                novoSalario = salario + reajuste;
                System.out.println("houve reajuste de 20% do salario: " + "R$" + reajuste);
                System.out.println("novo valor do salario: " + "R$" + novoSalario);
            } else if (diferenca >= 10 && diferenca < 20) {
                //15% para aqueles que ganham acima de dez até vinte salários mínimos;
                reajuste = (0.15 * salario);
                novoSalario = salario + reajuste;
                System.out.println("houve reajuste de 15% do salario: " + "R$" + reajuste);
                System.out.println("novo valor do salario: " + "R$" + novoSalario);
            } else {
                //10% para os demais funcionários
                reajuste = (0.10 * salario);
                novoSalario = salario + reajuste;
                System.out.println("houve reajuste de 10% do salario: " + "R$" + reajuste);
                System.out.println("novo valor do salario: " + "R$" + novoSalario);
            }


        } while (contador < 3);
    }
}