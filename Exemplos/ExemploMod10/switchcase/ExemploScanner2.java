package Exemplos.ExemploMod10.switchcase;

import java.util.Scanner;

public class ExemploScanner2 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome : ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura : ");
        double altura = scanner.nextDouble();

        System.out.println(nome + " tem " + altura + " de altura");

        scanner.close();
    }
    
}
