package Exemplos.ExemploMod10.switchcase;

import java.util.Scanner;

public interface ExemploIdade {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade){
        String result;
        switch (idade){
            case 0:
            case 5 :
            result = "Infantil";
            break;
            case 6:
            case 10:
            result = "Juvenil";
            break;
            case 11:
            case 18:
            result = "Adolescente";
            break;
            default:
            result = "Adulto";
            break;

        }
        return result;
    }
    
}
