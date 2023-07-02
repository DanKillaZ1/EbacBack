package Exemplos.ExemploMod10.forwhile;

import java.util.Scanner;

public class tabuadaWhile {

    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite um número para ver sua tabuada: ");
            String resposta = s.next();

            while (resposta.equals("s")){
                System.out.println("Digite um número para ver sua tabuada: ");
                int numero = s.nextInt();
                for (int i = 0; i <= 10; i++){
                    System.out.println(numero + " x " + i + " = " + numero * i);
                }

                System.out.println("Deseja continuar? (s/n)");
                resposta = s.next();
            }
        }

        System.out.println("Fim do programa");
        
    }
}
