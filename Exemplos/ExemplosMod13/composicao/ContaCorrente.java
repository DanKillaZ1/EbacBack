package Exemplos.ExemplosMod13.composicao;

public class ContaCorrente {

    private Banco banco;

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    

    private Double saldo;

    private Double ChequeEspecial;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return this.ChequeEspecial;
    }

    public void setChequeEspecial(Double ChequeEspecial) {
        this.ChequeEspecial = ChequeEspecial;
    }

}
