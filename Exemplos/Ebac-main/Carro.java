public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String cambio;
    private int motor;


    public Carro(String marca, String modelo, int ano, String cor, String cambio, int motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.cambio = cambio;
        this.motor = motor;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }


    /**
     * @author daniel
    Esta classe representa um carro do mundo real. Possui propriedades como marca,
    modelo, ano,cambio, motor e cor. Também possui métodos simples para ligar, desligar, acelerar
    e frear o carro.
    */


}
