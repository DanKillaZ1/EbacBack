package Exemplos.mod9;


import java.util.Scanner;

public class Exercicio {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor : ");
        int valor = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valor);

        System.out.println("Valor digitado : " + valorWrapper);

        scanner.close();
    }
    
}
