package Exemplos.ExemplosMod13.composicao;

public class ContaPoupanca {

    private Banco banco;

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    private Double saldo;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
