package Exemplos.ExemplosMod13.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    
    private Set<ContaCorrente> contasCorrentes;
    
    private Set<ContaPoupanca> contasPoupanca;
    
    public Banco(){
        this.contasCorrentes = new HashSet<>();
        this.contasPoupanca = new HashSet<>();
    }
    
    private Banco banco;

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public void add(ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp){
        this.contasPoupanca.add(cp);
    }
    
}
