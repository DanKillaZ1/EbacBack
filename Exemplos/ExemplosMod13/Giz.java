package Exemplos.ExemplosMod13;

public class Giz implements ICaneta {

    @Override
    public void escrever(String texto) {
        // TODO Auto-generated method stub
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        // TODO Auto-generated method stub
        return "Branco";
    }

    
}
