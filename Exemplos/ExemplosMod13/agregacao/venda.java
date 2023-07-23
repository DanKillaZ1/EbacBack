package Exemplos.ExemplosMod13.agregacao;

import java.util.ArrayList;
import java.util.List;

public class venda {

    private Comprador comprador;

    private Vendedor vendedor;

    public venda(){
        this.produtos = new ArrayList<Produto>();
    }

    private List<Produto> produtos;

    private Produto produto;

    public Comprador getComprador() {
        return this.comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void concretizarVenda() {
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Produtos: ");
        for (Produto produto : this.produtos) {
            System.out.println("Nome produto " + produto.getNome() + " Preço: " + produto.getPreco());
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");

    }
}
