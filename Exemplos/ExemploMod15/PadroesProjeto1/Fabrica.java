package PadroesProjeto1;

public abstract class Fabrica {
    public abstract Car createCarro(String nome);


    Fabrica factory = new Toyota();
    Car car = factory.createCarro("Corolla");

    
}
