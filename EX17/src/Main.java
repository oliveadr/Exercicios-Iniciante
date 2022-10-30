/*
* Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo
* entre 10 (inclusive) e 150 (inclusive)
*
*
* */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random geradorNumero = new Random();
        int numero = 0;
        int contador = 0;
       System.out.println("_____________");
        for (int i = 0; i<80;i++){
            numero = geradorNumero.nextInt(150);
            if(numero>=10 && numero<=150){
                contador++;
            }
        }
        System.out.println("_________________");
        System.out.println(contador);
    }
}