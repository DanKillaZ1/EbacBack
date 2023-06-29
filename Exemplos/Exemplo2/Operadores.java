public class Operadores {
    
    public static void main(String args []){
        
        operadoresAritmeticas() ;
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operadoresRelacionais();
        operadoresLogicos();
            
    }  

    private static void operadoresLogicos() {
        System.out.println("*** Operações relacionais ***");
        int num1 = 10;
        int num2 = 20;

       
        boolean isDentro10 = num1 >= 1 && num1 <= 10;
        System.out.println("O valor de isDentro10 é " + isDentro10);
    
        boolean isDentro20 = num1 >= 1 || num1 <= 10;
        System.out.println("O valor de isDentro20 é " + isDentro20);

        boolean isNot = num1 >= 1;
        System.out.println("O valor de isNot é " + isNot);
    }

    private static void operadoresRelacionais() {
        System.out.println("*** Operações relacionais ***");
        int num1 = 10;
        int num2 = 20;

        boolean isMaior = num1 > num2;
        System.out.println("O valor de isMaior é " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("O valor de isIgual é " + isIgual);

        boolean isDiff = num1 != num2;
        System.out.println("O valor de isMaior é " + isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("O valor de isMaiorIgual é " + isMaiorIgual);

    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("*** Operações de incremento e decremento ***");

        int um1 = 10;
        System.out.println("O valor de um1 é " + um1);
        um1++;
        System.out.println("O valor de um1 é " + um1);

        um1--;
        System.out.println("O valor de um1 é " + um1);


    }


    private static void operacoesAtribuicoes() {
        System.out.println("*** Operações de atribuições ***");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println("O valor de numero3 é " + numero3);
        numero3 += numero3;
        System.out.println("O valor de numero3 é " + numero3);
    }

    private static void operadoresAritmeticas() {
        int num1 = 10;
        int num2 = 20;
            
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        int num6 = num1 / num2;
        int num7 = (10 + 50)/2;
            
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + num3);
        System.out.println("A subtração de " + num1 + " - " + num2 + " = " + num4);
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + num5);
        System.out.println("A divisão de " + num1 + " / " + num2 + " = " + num6);
        System.out.println("A média de 10 e 50 é " + num7);
    }
        
    

    
}
