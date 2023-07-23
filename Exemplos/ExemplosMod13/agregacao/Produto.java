package Exemplos.ExemplosMod13.agregacao;

public class Produto {

    Produto produto = new Produto();

    private String nome;

    private Long codigo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    private Double preco;

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }




    public void vendido() {
        System.out.println("Produto vendido");
    }
}
