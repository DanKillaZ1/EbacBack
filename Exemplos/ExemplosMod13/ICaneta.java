package Exemplos.ExemplosMod13;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    default void escreverComumATodas(){
        System.out.println("Escrevendo comum a todas");
    }
    
}
