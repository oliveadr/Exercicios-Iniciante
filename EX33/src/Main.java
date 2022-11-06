import java.util.Scanner;

/*
* A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
* calcule e exiba o salário de um professor.
* Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o nivel do Profº: ");
        int nivel = sc.nextInt();
        System.out.println("informe a qtd de aulas do Profº");
        int horaAula = sc.nextInt();
        int salario;
        if (nivel == 1){
            salario = horaAula * 12;
            System.out.println("salario: " + salario);
        } else if (nivel == 2) {
            salario = horaAula * 17;
            System.out.println("salario: " + salario);
        }else if (nivel == 3 ){
            salario = horaAula*25;
            System.out.println("salario: " + salario);
        }
    }
}