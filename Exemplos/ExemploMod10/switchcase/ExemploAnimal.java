package Exemplos.ExemploMod10.switchcase;

import java.util.Scanner;

public class ExemploAnimal {
    
     public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfSwitch(texto);
        System.out.println(animal);
     }

     public static String exampleOfSwitch(String animal){
         String result;
         switch (animal){
             case "cachorro":
             case "gato" :
             result = "Animal doméstico";
             break;
             case "leão":
             case "tigre":
             result = "Animal selvagem";
             break;
             default:
             result = "Animal desconhecido";
             break;

         }
         return result;
     }
}
