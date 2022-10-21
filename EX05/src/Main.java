import java.util.Scanner;
/*Escreva um algoritmo que leia o nome de um aluno e as notas das
* três provas que ele obteve no semestre.
* No finalinformar o nome do aluno e a sua média (aritmética);
*/
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("digite o nome do aluno: ");
       String nomeAluno = sc.next();
       double nota1 = sc.nextDouble();
       double nota2 = sc.nextDouble();
       double nota3 = sc.nextDouble();
       double soma= nota1+nota2+nota3;
       double media=soma/3;
        System.out.println("o aluno " + nomeAluno + "tem media: "+media);
    }
}