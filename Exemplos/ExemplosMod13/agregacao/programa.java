package Exemplos.ExemplosMod13.agregacao;

public class programa {


    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, "TV", 10d);
        Produto produto2 = criarProduto(2L, "celular", 20d);


        Vendedor vendedor = criarVendedor("Daniel", 10d);

        Comprador comprador = criarComprador("Daniel", 20d);


        venda venda = new venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.addProduto(produtoTV);
        venda.addProduto(produto2);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        System.out.println(venda);

    }

    private static Comprador criarComprador(String nome, double dinheiro) {
        return new Comprador(nome, dinheiro);
        
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(null);
        vendedor.setNome(null);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, String nome, Double preco) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setCodigo(codigo);
        produto.setPreco(preco);
        return produto;
    }
    
}
