package Exemplos.ExemploMod10.switchcase;

import java.util.Scanner;

public class Exemploscanner {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor : ");
        int valor = scanner.nextInt();        

        System.out.println("Valor digitado : " + valor + "reais");
        scanner.close();
    }
    
}