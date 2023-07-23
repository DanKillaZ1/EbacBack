package Exemplos.ExemplosMod13;

public interface ICarro {
    

    default void parar(){
        System.out.println("Carro esta parando");
    }

    public void andar ();

    


}
