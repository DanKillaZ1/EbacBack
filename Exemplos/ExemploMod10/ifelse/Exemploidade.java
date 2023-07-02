package Exemplos.ExemploMod10.ifelse;

import java.util.Scanner;

public class Exemploidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade : ");
        int idade = scanner.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        if (idade >= 0 && idade <=5) {
            return "vc e uma bebe";
        } else if (idade >= 6 && idade <= 10) {
            return "voce e uma crianca";
        } else if (idade >= 11 && idade <= 17) {
            return "voce e um adolescente";
        }else{
            return "voce e um adulto";
        }
    }
    
}
