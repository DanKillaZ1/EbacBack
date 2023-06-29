package Exemplos.Exercicio;

import java.util.Scanner;

/**
 * TarefaCalculoMedio
 * @author Daniel
 */

public class TarefaCalculoMedio {
    public static void main(String[] args) {  
        Scanner Scanner = new Scanner(System.in); 


        System.out.println("Digite as notas do aluno");
        double nota1 = Scanner.nextDouble();
        double nota2 = Scanner.nextDouble();
        double nota3 = Scanner.nextDouble();
        double nota4 = Scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A médiaa do aluno é " + media);

        Scanner.close();
    }

}
