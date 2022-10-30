import java.util.Scanner;

/*
* Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
* Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
* Informe o valor de custo de cada produto, o valor de venda de cada produto,
* a média de preço de custo e do preço de venda
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precoCusto,precoVenda;
        float totalCusto = 0,totalVenda = 0;
        String nomeProduto;
        int i = 0;
        do {
            i++;
            System.out.println("informe o preco de custo: ");
            precoCusto = sc.nextFloat();
            totalCusto += precoCusto;
            System.out.println("informe o preco de venda: ");
            precoVenda = sc.nextFloat();
            totalVenda += precoVenda;
            if(precoCusto<precoVenda){
                System.out.println("lucro");
            } else if (precoCusto>precoVenda) {
                System.out.println("preju");
            } else if (precoCusto==precoVenda) {
                System.out.println("empate");
            }



        } while (i<40);
        float mediaCusto = totalCusto/i;
        float mediaVenda = totalVenda/i;
        System.out.println("media de preco de custo: " + mediaCusto);
        System.out.println("media de preco de venda: " + mediaVenda);
    }
}