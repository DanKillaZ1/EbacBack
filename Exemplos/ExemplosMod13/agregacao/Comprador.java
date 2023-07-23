package Exemplos.ExemplosMod13.agregacao;

public class Comprador {

    private Double dinheiro;

    private String nome;

    public Comprador(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }



    public void comprar(Produto produto) {
        produto.vendido();
    }
    
}
