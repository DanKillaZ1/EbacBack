package Exemplos.ExemploMod10.forwhile;

public class ExemploPPT3 {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 1000; contador++) {
            if (contador %5!=0){
                continue;
            } 
                
            
            System.out.println("Valor de contador : " + contador);
        }
    }
}
