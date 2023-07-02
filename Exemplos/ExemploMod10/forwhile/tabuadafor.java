package Exemplos.ExemploMod10.forwhile;

import java.util.Scanner;

public class tabuadafor {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int result = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(result + " x " + i + " = " + (result * i));
        }
    }
    
}
