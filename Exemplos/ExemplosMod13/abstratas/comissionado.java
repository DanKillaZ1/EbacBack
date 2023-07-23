package Exemplos.ExemplosMod13.abstratas;

public class comissionado extends Empregado {

    private double totalVendas;

    private double totalComissao;

    public double getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalComissao() {
        return this.totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    

    @Override
    public Double vencimento() {
        return totalVendas * totalComissao;
    }
    
}
