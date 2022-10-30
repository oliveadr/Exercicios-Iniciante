/*
* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde)
* e informe se está apta ou não para cumprir o serviço militar obrigatório.
* Informe os totais;
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        char cadastro, saude,sexo;
        int idade;
        do{
            System.out.println("informe o nome: ");
            nome = sc.next();
            System.out.println("informe o sexo:");
            sexo = sc.next().charAt(0);
            System.out.println("informe se a saude esta ok:");
            saude = sc.next().charAt(0);
            if (saude == 's'){
                System.out.println("a pessoa e apta para cumprir o serviço militar");
            }
            System.out.println("continuar o cadastro?");
            cadastro = sc.next().charAt(0);
        } while (cadastro == 's');

    }
}