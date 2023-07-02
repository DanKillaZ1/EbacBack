package Exemplos.ExemploMod10.forwhile;

public class ExemploPPT4 {

    public static void main(String[] args){
        int count = 0;
        while (count < 1000) {
            System.out.println("Valor de contador : " + count);
            count++;
            if (count == 10) 
                break;
            
        }
    }
    
}
