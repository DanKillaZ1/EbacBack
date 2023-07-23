package Exemplos.ExemplosMod13.agregacao;

public class Vendedor {

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double comissao;

    public Double getComissao() {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }



    public void vender(Produto produto) {
        produto.vendido();
    }
    
}
