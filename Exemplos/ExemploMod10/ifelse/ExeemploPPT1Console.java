package Exemplos.ExemploMod10.ifelse;

import java.util.Scanner;

public class ExeemploPPT1Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int result = scanner.nextInt();

        if (result > 1 ){
            System.out.println("Resultado maior que 1 ");
        } else if (result < 1 && result > 8){
            System.out.println("Resultado esta entre 1 e 8");
        } else {
            System.out.println("Resultado menor que 1");
        }
    }
    
}
